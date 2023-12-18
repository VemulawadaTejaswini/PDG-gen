import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=1;
  	long k=sc.nextLong();
  	int[] a=new int[n];
  	for(int i=0;i<n;i++){
  		a[i]=sc.nextInt();
  	}
  	for(long i=0;i<k%n;i++){
  		f=a[f-1];
  	}
  	System.out.print(f);
  }
}