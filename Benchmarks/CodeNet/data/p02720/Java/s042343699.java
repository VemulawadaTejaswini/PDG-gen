import java.util.Scanner;

public class Main {
	static int co=0;
	static int K;
	static boolean ok = false;
	static long ans = 0;
	
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			 K= scan.nextInt();
			
			int count=0;
			int keta = 0;
		
			
			while(true) {
				keta++;
				
				for(int i = 1;i<=9;i++) {
					po(i,keta,""+i+"");
				}
			}
			
			
			
			
		}
		
		
	}
	
	
	private static void po(int n,int count,String s) {
		
		if(count==1) {
			co++;
			//System.out.print(s);
			//System.out.print(" ");
			//System.out.println(co);
			if(K==co) {
				ans = Long.valueOf(s);
				ok=true;
				System.out.println(ans);
				System.exit(0);
			}
			
		}else {
			if(n==0) {
				po(n,count-1,s+""+n+"");
				po(n+1,count-1,s+""+(n+1)+"");
			}else if(n==9) {
				po(n-1,count-1,s+""+(n-1)+"");
				po(n,count-1,s+""+n+"");
				
			}else{
				po(n-1,count-1,s+""+(n-1)+"");
				po(n,count-1,s+""+n+"");
				po(n+1,count-1,s+""+(n+1)+"");
			}
		}
		
		
	}
		

}
