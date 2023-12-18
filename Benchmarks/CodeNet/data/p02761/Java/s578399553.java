/* Click on the checkbox for Add Custom Input and then write the input there before running the program */
import java.util.*;
public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    int m = input.nextInt();
	    int[] a = new int[n];
	    Arrays.fill(a,-1);
	    boolean flag = false;
	    for(int i=0;i<m;i++)
	    {
	        int s = input.nextInt();
	        int c = input.nextInt();
	        int ind = s-1;
	        if(a[ind]==-1){
	            a[ind]=c;
	            flag = true;
	        }
	        else
	        {
	            if(a[ind]==c){
	                flag = true;
	                continue;
	            }
	            else
	            {
	                flag = false;
	                break;
	            }
	                
	        }
	    }
	    if(!flag||a[0]==0)
	        System.out.println(-1);
	    else{
	        for(int i=0;i<n;i++)
	            if(a[i]==-1)
	                a[i]=0;
	        for(int i=0;i<n;i++)
	            System.out.print(a[i]+" ");
	    }
	}
}