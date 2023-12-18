import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),min=Integer.MAX_VALUE;
    int[] a=new int[n];
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    Arrays.sort(a);
    for(int i=0;i<n-1;i++) {
    	for(int j=i+1;j<n;j++) {
    		if((a[j]%a[i])%2!=0) {
    			System.out.println(1);
    			System.exit(0);
    		}else if(a[j]%a[i]!=0){
    			min=Math.min(min, a[j]%a[i]);
    		}
    	}
    }
    if(min==Integer.MAX_VALUE) {
    	System.out.println(a[0]);
    }else {
    	System.out.println(min);
    }

  }
}
