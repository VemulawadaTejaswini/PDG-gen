import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		
			int n=scn.nextInt();
			 int val1=n;
			 long ans=7;
			 long cnt=0;
			 while(val1>10){
				 ans*=10;
				 ans+=7;
				 cnt++;
				 val1/=10;
			 }
			 HashSet<Long> hs =new HashSet<>();
			 
			 boolean f=false;
			
			 while(true){
				 long mod = ans%n;
				 if(mod==0){
					 break;
				 }
				 if(hs.contains(mod)){
					 f=true;
					 break;
				 }
				 hs.add(mod);
				 ans=mod*10+7;
				 cnt++;
			 }
			 if(f){
				 System.out.println(-1);
			 }else{
				 System.out.println(cnt+1);
			 }
		}

	

}