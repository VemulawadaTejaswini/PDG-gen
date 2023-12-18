import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;

        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] LR=new int[2][M];
        int[][] pq=new int[2][Q];
        int count=0;
        for(int i=0;i<M;i++) {
        	LR[0][i]=sc.nextInt();
        	LR[1][i]=sc.nextInt();
        }
        for(int i=0;i<Q;i++) {
        	pq[0][i]=sc.nextInt();
        	pq[1][i]=sc.nextInt();
        }
        for(int i=0;i<Q;i++) {
        	count=0;
        	for(int j=0;j<M;j++) {
        	if(LR[0][j]>=pq[0][i])
        	{
        		if(LR[1][j]<=pq[1][i])
        		{
        		count++;
        		}
        	}
        	}
        	System.out.println(count);
        }

        //System.out.println(K);
        //System.out.println();
	}

}