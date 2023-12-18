import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] A = new int[N];
        int pos = 0;
        for(int i=0;i<N;i++){
            A[i]=in.nextInt();
        }
        for(int i=0;i<N;i++){
            if(A[i]==1){
                pos = i;
                break;
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<K;j++){
            int left = Math.max(0,pos-j); // 长度为left,最右端邻居是1
            int right = Math.max(0,(N-pos)-(K-j)); //长度为right
            int leftTimes = 0;
            if(left>0) leftTimes = (left-1)/(K-1)+1;
            int rightTimes = 0;
            if(right>0) rightTimes = (right-1)/(K-1)+1;
            ans = Math.min(ans,1+leftTimes+rightTimes);
        }
        System.out.println(ans);
    }
}