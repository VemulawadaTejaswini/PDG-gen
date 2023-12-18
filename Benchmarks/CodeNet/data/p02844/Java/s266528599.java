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
        char[] S=sc.next().toCharArray();
        long ans = 0;
        for(int i=1;i<=999;i++){
            char[] temp = String.format("%03d",i).toCharArray();
            int k=0;
            for(int j=0;j<N;j++){
                if(k<3&&S[j]==temp[k]){
                    k++;
                }
            }
            if(k==3){
                ans++;
            }

        }
        System.out.println(ans);

    }
}
