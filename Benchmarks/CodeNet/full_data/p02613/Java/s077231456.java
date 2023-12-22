import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans[] = new int[4];
        for(int i = 0; i < N; i++){
            String S = sc.next();
            if(S.equals("AC")){
                ans[0]++;
            }else if(S.equals("WA")){
                ans[1]++;
            }else if(S.equals("TLE")){
                ans[2]++;
            }else if(S.equals("RE")){
                ans[3]++;
            }
        }
        System.out.println("AC x "+ans[0]);
        System.out.println("WC x "+ans[1]);
        System.out.println("TLE x "+ans[2]);
        System.out.println("RE x "+ans[3]);
    }
}
