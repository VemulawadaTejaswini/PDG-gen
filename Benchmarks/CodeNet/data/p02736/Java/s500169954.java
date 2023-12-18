import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n= Integer.parseInt(s.nextLine().trim());
	    String[] f=s.nextLine().trim().split("");
	    int [] hh= new int[n];
	    for(int i=0;i<n;i++){
	        hh[i]=Integer.parseInt(f[i]);
	        
	    }
	    for(int i=1;i<n;i++){
	        for(int j=0;j<n-i;j++){
	            hh[j]=Math.abs(hh[j+1]-hh[j]);
	        }
	    }
	    System.out.println(hh[0]);
	}
}
