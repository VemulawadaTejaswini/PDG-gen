import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr =new int[n];
		int max=1;
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
			max=Math.max(arr[i], max);
		}
		  res(arr,max);

	}
	public static void res(int []arr ,int max){
		int [] spf =new int[max+1];
		spf[1]=1;
	  for(int i=0;i<=max;i++){
		  spf[i]=i;
	  }
		for(int i=2;i<=max;i++){
			spf[i]=2;
		}
		for(int i=3;i*i<=max;i++){
			if(spf[i]==i){
			for(int j=i*i;j<=max;j+=i){
				if(spf[j]==j){
					spf[j]=i;
				}
			}
			
			}
		}
//		for(int i=0;i<spf.length;i++){
//			System.out.println(spf[i]);
//		}
		
		HashSet<Integer>hs2 =new HashSet<>();
		int ans=0;
		boolean f=false;
	  for(int i=0;i<arr.length;i++){
		  
		  HashSet<Integer> hs =pf(arr[i],spf);
		  ans+=hs.size();
		  for(int val :hs){
			  hs2.add(val);
		  }
		  if(hs2.size()!=ans){
			  f=true;
			  break;
		  }
		  
	  }
	 
	  if(f==false){
		  System.out.println("pairwise coprime");
		  return ;
	  }else{
		  int gcd=arr[0];
		for(int i=1;i<arr.length;i++){
			gcd=gcd(gcd,arr[i]);
			if(gcd==1){
				System.out.println("setwise coprime");
				return ;
			}
		}
	  }
	  System.out.println("not coprime");
		
	}
	public static int gcd(int a ,int b){
		if(b==0){
			return a;
		}
		
		return gcd(b,a%b);
	}
	public static HashSet<Integer>  pf(int val,int [] spf){
		HashSet<Integer> hs =new HashSet<>();
		while(val!=1){
			hs.add(spf[val]);
			val/=spf[val];
		}
		return hs;
	}

}