import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

//
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int cnt = 0;
        int count = 0;
        int ans = 0;
        int input[][]=new int[M+1][N+1];
        int input_p[]=new int[M+1];

        for(int i=1;i<=M;i++){
            int K = sc.nextInt();
            input[i][0]= K;
            for(int j=1;j<=K;j++){
                input[i][j]=sc.nextInt();
            }
        }

        for(int k=1;k<=M;k++){
            input_p[k]=sc.nextInt();
        }



        for(int bit=0;bit<(1<<N);bit++){
            for(int i=1;i<=M;i++){
                for(int j=1;j<=input[i][0];j++){
                    if(((((1<<(input[i][j]-1))&bit)>>(input[i][j]-1)))==1){
                    cnt=cnt+1;
                    }
                }
                if(input_p[i]==cnt%2){
                    count=count+1;
                }
            }
            if(count==M){
            ans=ans+1;
            }
            count=0;
            cnt=0;
        }
    System.out.println(ans);
    }
}





