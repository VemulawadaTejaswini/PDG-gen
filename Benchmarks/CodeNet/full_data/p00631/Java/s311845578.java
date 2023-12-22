import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        	int n = sc.nextInt();
        	int sum = 0;
        	int A=0;
        	int minnow=0;
        	int minold=10000000;
        	if(n==0)break;
        	int[] pow = new int[20];
        	for(int i=0;i<n;i++){
        		pow[i] = sc.nextInt();
        		sum += pow[i];
        	}
			//System.out.println(pow[1]);
        	Arrays.sort(pow);
        	//System.out.println(Arrays.toString(pow));
        	//System.out.println(pow[20-n+1]);
        	for(int j=0;;j++){
        		A += pow[20-n+j];
        		minnow = Math.abs(sum-A*2);
    			//System.out.println(pow[20-n+j]);
        		if(minold<=minnow){
        			System.out.println(minold);
        			break;
        		}
        		minold = minnow;
        		
        		A += pow[19-j];
        		minnow = Math.abs(sum-A*2);
    			//System.out.println(minnow);
        		if(minold<=minnow){
        			System.out.println(minold);
        			break;
        		}
        		minold = minnow;
        	}
        }
    }
 
}