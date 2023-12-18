import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        ArrayList<Integer> cnts = new ArrayList<>();

        char current = '0';
        int cnt = 0;

        for(int i=0; i<S.length(); i++){
            if(i == S.length()-1){
                if(current == S.charAt(i)){
                    cnts.add(cnt+1);
                }else{
                    cnts.add(cnt);
                    cnts.add(1);
                }
            }

            if(current == S.charAt(i)){
                cnt++;
            }else{
                cnts.add(cnt);
                current = S.charAt(i);
                cnt = 1;
            }
        }

        int zero = 0;
        int one = 0;
        long acc = 0;

        for(int i=0; i<cnts.size(); i++){
            if(i%2 == 0){
                zero += cnts.get(i);
            }else{
                one += cnts.get(i);
            }

            int diff = Math.min(zero, one);
            acc += diff;
            zero -= diff;
            one -= diff;
        }

        System.out.println(acc * 2);
    }
}
