import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean b=true;
	    int[]arr=new int[n];
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    for(int i=0;i<n-1;i++) {
	    	if(arr[i]==arr[i+1]) {
	    		b=false;
	    		break;
	    	}
	    }
	    if(b==true)
	    	System.out.println("YES");
	    else
	    	System.out.println("NO");
	}
	
}