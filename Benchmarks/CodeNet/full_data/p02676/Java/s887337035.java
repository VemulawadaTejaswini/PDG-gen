import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		String s=sc.next();
		
		String ans="";
	
		if(s.length()<=k){
			System.out.println(s);
		}else {
			for(int i=0;i<k;i++){
				ans=ans+s.charAt(i);
			
		}
		System.out.println(ans+"...");
		}
	}

}