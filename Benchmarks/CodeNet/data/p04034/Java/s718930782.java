    import java.util.Arrays;
import java.util.Scanner;
    
    public class Main{
    public static void main(String args[]){
    int N = 0;
    int M = 0;
    int count = 1;
    int[] x = new int[10001];
    int[] y = new int[10001];
    int[] ball = new int[10001];
    boolean[] over1 = new boolean[10001];
    Arrays.fill(ball, 1);
    Arrays.fill(over1, true);
    Scanner scan = new Scanner(System.in);
    
    N=scan.nextInt();
    M=scan.nextInt();
    for(int i=0;i<M;i++){
    	x[i]=scan.nextInt();
    	y[i]=scan.nextInt();
    }
    
    for(int i=0;i<M;i++){
    	/*if(ball[x[i]]==1){
    		ball[x[i]]=0;
    		ball[y[i]]++;
    	}else if(ball[x[i]]>1){*/
    		count++;
    		ball[x[i]]--;
    		ball[y[i]]++;
    		over1[y[i]]=false;
    		if(ball[x[i]]==0)count--;
    		if(ball[x[i]]==0 && over1[x[i]]==false)count--;
    	}
    //}
	System.out.println(count);
    }
}