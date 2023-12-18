import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String S = in.next();
        int[] face = new int[N];
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='W') face[i]=1;
            else face[i] = 0;
        }
        int[] sum = new int[N];
        sum[0]=face[0];
        for(int i=1;i<N;i++){
            sum[i]=sum[i-1]+face[i];
        }
        int result = N-1-(sum[N-1]-sum[0]); // attention to the far left
        for(int i=1;i<N-1;i++){
            int left = sum[i-1]; // the i-1 people on the left attention to east
            int right = (N-1-i) -(sum[N-1]-sum[i]); // the N-i-1 people the the right attention to west
            result = Math.min(result,left+right);
        }
        result = Math.min(result, sum[N-2]); // attention to far right

        System.out.println(result);

    }
}