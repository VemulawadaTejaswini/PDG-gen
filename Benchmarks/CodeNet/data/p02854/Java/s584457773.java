import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n];
    double l=0,sum=0;
    
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextLong();
    	sum+=a[i];
    }
    for(int i=0;i<n;i++) {
    	if(l<sum/2) {
    		l+=a[i];
    	}
    	if(l==sum/2){
    		System.out.println("0");
    		break;
    	}
    	if(l>sum/2){
    		System.out.println((long)Math.abs(2*l-sum));
    		break;
    	}
    }
  }
}
