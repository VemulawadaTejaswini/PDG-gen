import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=1,b=0,flag=0;
  	long k=sc.nextLong();
  	int[] a=new int[n],l=new int[n];
  	
  	for(int i=0;i<n;i++){
  		l[i]=0;
  	}
  	for(int i=0;i<n;i++){
  		a[i]=sc.nextInt();
  		l[a[i]-1]++;
  	}
  	for(int i=0;i<n;i++){
  		if(l[a[i]-1]>1){
  			b++;
  		}
  	}
  	if(b==0){
  		for(int i=0;i<=k%n;i++){
  			f=a[f-1];
  		}
  	}else{
  		while(flag<k){
  			f=a[f-1];
  			flag++;
  			if(l[f-1]>1){
  				break;
  			}
  		}
  		
  		if((k-flag)>0){
  			for(long i=0;i<(k-flag)%b-1;i++){
  				f=a[f-1];
  			}
  		}
  	}
  	System.out.print(f);
  }
}