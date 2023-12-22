import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    float a[]=new float[n];
		for(int i=0;i<n;i++) a[i]=sc.nextFloat();
		int ans = 0;
		for(int i=0;i<n;i++){
		    float c = a[i];
		    for(int j =0;j<n&&j!=i;j++){
		       float e = c*a[j];
		       float d = (int)(c*a[j]);
		       float f = e-d;
		       if(f==0) ans++;
		    }
		}
		System.out.println(ans);
	}
}
