import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        char[] S= sc.next().toCharArray();
        long ans = 0;
        if(N<3){
            ans = 0;
        }else if(N>=3){
            for(int i=0;i<N;i++){
                for(int k=i+2;k<N;k++){
                    for(int j=i+1;j<k;j++){
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
