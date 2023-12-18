import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int N = in.nextInt();
        int choice = in.nextInt();
        long ans = 0;
        
        long[][] pur = new long[N][3];
        
        long[][] sum = new long[8][N];
        
        long[] sumsum = new long[8];
        
        for(int i=0;i<N;i++){
        	pur[i][0] = in.nextLong();
        	pur[i][1] = in.nextLong();
        	pur[i][2] = in.nextLong();
        }
        
        for(int i=0;i<N;i++){
        	sum[0][i] = pur[i][0] + pur[i][1] + pur[i][2];
        	sum[1][i] = pur[i][0] + pur[i][1] - pur[i][2];
        	sum[2][i] = pur[i][0] - pur[i][1] + pur[i][2];
        	sum[3][i] = pur[i][0] - pur[i][1] - pur[i][2];
        	sum[4][i] = -pur[i][0] + pur[i][1] + pur[i][2];
        	sum[5][i] = -pur[i][0] + pur[i][1] - pur[i][2];
        	sum[6][i] = -pur[i][0] - pur[i][1] + pur[i][2];
        	sum[7][i] = -pur[i][0] - pur[i][1] - pur[i][2];
        }
        
        for(int i=0;i<8;i++)
        	Arrays.sort(sum[i]);	
        
        for(int i=0;i<8;i++){
        	for(int j=0;j<choice;j++){
        		sumsum[i] += sum[i][N-j-1];
        	}
        	if(ans<sumsum[i])
        		ans = sumsum[i];

        }
        
        System.out.println(ans);
    }

}
