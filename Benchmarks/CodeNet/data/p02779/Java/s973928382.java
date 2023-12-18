import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
    long[] a=new long[n];
    
  	
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
    }
  	Arrays.sort(a);
  	for(int i=0;i<n-1;i++){
  		if(a[i]==a[i+1]){
  			System.out.println("NO");
  			f++;
  			break;
  		}
  	}
  	if(f==0){
  		System.out.println("YES");
  	}
  }
}
