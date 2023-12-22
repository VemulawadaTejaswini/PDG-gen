import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	      long n=sc.nextLong();
    long k=sc.nextLong();
   ArrayList<Long> al=new ArrayList<>();
    for(int i=0;i<n;i++){
		al.add(sc.nextLong());
      
    }
  
    long ans=1;
    for(int i=0;i<k;i++){
			ans=ans*al.get(i)%(1000000007);
			
    }
    if(k==n) {
    	System.out.print(ans);
    }else {
    long res=Integer.MIN_VALUE;
    for(int i=(int)k;i<n;i++){
			long c=al.get(i-(int)k);
      long temp=ans;
      temp=temp/c;
      
      if(((temp*al.get(i))%1000000007)>ans){
			ans=(temp*al.get(i))%(1000000007);
			
      }
      res=Math.max(ans, res);
      ans=ans/c;
      ans=(ans*al.get((i)))%(1000000007);
      
    }
    if(res<0) {
    	System.out.println(1000000007+res);
    }else {
    
    System.out.println(res%(1000000007));
    }
    }
		
                }
                }