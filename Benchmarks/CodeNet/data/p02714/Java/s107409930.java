import java.util.*;

public class Main {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        char[] S= sc.next().toCharArray();
        long ans = 0;
        if(N<3){
            ans = 0;
        }else if(N>=3){
            int count = N;
            int num = 0;
            for (int i = 0; i < count - 2; i++) {
                for (int j = i + 1; j < count - 1; j++) {
                    for (int k = j + 1; k < count; k++) {
                        if(S[i]!=S[j]&&S[j]!=S[k]&&S[i]!=S[k]&&j-i!=k-j){
                            ans++;
                        }
                    }
                }
            }
        }

       System.out.println(ans);



    }
}
