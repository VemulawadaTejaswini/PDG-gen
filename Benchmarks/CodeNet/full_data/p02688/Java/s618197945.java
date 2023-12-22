import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt(),e=0;
  	int[] d=new int[k],a=new int[n],f=new int[n];
  	for(int i=0;i<n;i++){
  		f[i]=0;
  	}
  	for(int i=0;i<k;i++){
  		d[i]=sc.nextInt();
  		int[] b=new int[d[i]];
  		for(int j=0;j<d[i];j++){
  			b[j]=sc.nextInt();
  			f[b[j]-1]++;
  		}
  	}
  	for(int i=0;i<n;i++){
  		if(f[i]==0){
  			e++;
  		}
  	}
  	System.out.print(e);
  }
}