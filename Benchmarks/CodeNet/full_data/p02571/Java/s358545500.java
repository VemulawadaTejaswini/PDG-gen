import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        Integer cnt = 0;
        Integer minCnt = 1000;

        for(int s = 0; s <= S.length() - T.length(); s++){
            for(int t = 0; t < T.length(); t++){
                System.out.println("s:" + S.toCharArray()[s + t] + ", t:" + T.toCharArray()[t]);
                if(S.toCharArray()[s + t] != T.toCharArray()[t]){
                    cnt++;
                }
            }
            if(cnt < minCnt) {
                minCnt = cnt;
            }
            cnt = 0;
            System.out.println("min:" + minCnt);
        }


        System.out.println(minCnt);
    }
}
