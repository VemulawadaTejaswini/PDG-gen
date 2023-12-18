import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	
	int[] p=new int[n];
	for(int i=0;i<n;i++)p[i]=sc.nextInt();
	
	int r=0;
	boolean def=false;
	int[] tmp=new int[k];
	for(int j=0;j<k;j++)tmp[j]=p[j];
	int[] now=new int[k];
	int[] nowtmp=new int[k];
	
	for(int i=k-1;i<n;i++){
		for(int j=i-k+1;j<=i;j++)now[j-(i-k+1)]=p[j];
		nowtmp=now.clone();
		Arrays.sort(now);
		if(!Arrays.equals(tmp,now)){//違ったら
			r++;
		}else if(!def){if(Arrays.equals(now,nowtmp)){
			def=true; r++;
		}}
		//tmpのスライド
		if(i!=n-1){
			for(int j=0;j<k-1;j++)tmp[j]=now[j+1];
			tmp[k-1]=p[i+1];
		}
	}
	System.out.println(r);
 }
}