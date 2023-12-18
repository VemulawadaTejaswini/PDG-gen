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
        int p,q;
        int count=0;
        for(int i=0;i<M;i++) {
        	LR[0][i]=sc.nextInt();
        	LR[1][i]=sc.nextInt();
        }
        for(int i=0;i<Q;i++) {
        	p=sc.nextInt();
        	q=sc.nextInt();
        	count=0;
        	for(int j=0;j<M;j++) {
        	if(LR[0][j]>=p)
        	{
        		if(LR[1][j]<=q)
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
