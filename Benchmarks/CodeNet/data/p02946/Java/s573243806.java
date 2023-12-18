import java.util.*;	
public class Main {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int[] kuro=new int[2*A-1];
		String[] kuros=new String[2*A-1];
		String ans="";
		for(int i=0; i<2*A-1; i++) {
			kuro[i]=B-A+1+i;
			if(i==0) {
				ans=""+kuro[i];
			}else {
				ans+=" "+kuro[i];
			}
			
		}
		
		System.out.println(ans);
	  }	          	
}