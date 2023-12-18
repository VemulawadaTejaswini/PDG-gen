import java.util.*;


 class Main
 { 
	public static void main(String args[])
 	{ 

		Scanner sc =new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		int res = Integer.MAX_VALUE;
		
		loop: for(int i = l; i <= r; i++){
			for(int j = i+1; j <= r; j++){
				res = Math.min(res, i*j%2019);
				
				if(res == 0) break loop;
			}
		}
		
		System.out.println(res);

 	}
 }