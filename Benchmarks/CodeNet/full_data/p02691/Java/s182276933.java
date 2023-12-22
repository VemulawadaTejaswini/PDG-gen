import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
  	long[] a = new long[n];
  	for(int i=0;i<n;i++){
  		a[i]=sc.nextLong();
  	}
  	for(int i=0;i<n;i++){
  		if(a[i]>n-i-1){
  			continue;
  		}else{
  			for(int j=(int)(a[i]);j<n;j++){
  				if((j-i)==(a[i]+a[j])){
  					f++;
  				}
  			}
  		}
  	}
  	System.out.print(f);
  }
}