import java.util.*;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int n=sc.nextInt();
      int a=0;
      int f=0;
      ArrayList<Integer> lit = new ArrayList<Integer>();
      ArrayList<Integer> big = new ArrayList<Integer>();
      for(int i=0;i<n;i++){
      	a=sc.nextInt();
        if(a<x){
        	lit.add(a);
        }if(a==x){
        	f=5;
        }else{
        	big.add(a);
        }
      }
      if(f==0){
      	System.out.println(x);
        return;
      }
      Collections.sort(lit, Collections.reverseOrder());
      Collections.sort(big);
      int tl=1;
      int tb=1;
      int ct=0;
      
      int l=x;
      int b=x;
      while(tl==1 || tb==1){
      	tl=l-lit.get(ct);
        l=lit.get(ct);
        tb=big.get(ct)-b;
        b=big.get(ct);
        ct++;
      }
      if(tl<=tb){
      	System.out.println(l+tl-1);
        return;
      }else{
      	System.out.println(b-tb+1);
        return;
      }
	}
}