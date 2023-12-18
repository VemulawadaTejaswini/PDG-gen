import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int lastA = 0;
        int firstB = 0;
        int abCnt = 0;
        for(int i = 0; i < N; i++){
            String s = sc.next();
            for(int j = 0; j < s.length(); j++){
                if(j < s.length() - 1 &&
                    s.charAt(j) == 'A' &&
                    s.charAt(j + 1) =='B'){
                    abCnt++;
                }
            }
            if(s.charAt(0) == 'B'){
                firstB++;
            }
            if(s.charAt(s.length() - 1) == 'A'){
                lastA++;
            }
        }
        System.out.println(abCnt + (firstB > lastA ? lastA : firstB));
    }
}
