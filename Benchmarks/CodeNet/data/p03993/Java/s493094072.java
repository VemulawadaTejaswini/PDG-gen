import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();

        int n = scanner.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++ ){
            int lover = scanner.nextInt() - 1;
            if(lover < i){
                if(al.get(lover)==i){
                    cnt++;
                }
            }
            al.add(lover);
        }

        System.out.println(cnt);
    }
}

