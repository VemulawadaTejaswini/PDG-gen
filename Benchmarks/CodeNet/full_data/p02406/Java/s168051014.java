public class Main {


		public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n, i;
		

		n = scan.nextInt();
		
		if(3 <= n && n <= 10000){
			for(i = 3; i <= n ; i++){
				if(i % 3 == 0 || i % 10 == 3 || (30 <= i && i <= 39) || (300 <= i && i <= 399) || (3000 <= i && i <= 3999)){
					
				System.out.print(" "+i);
				}
				}
			
			
		
		
		
		
		}
		}
}	