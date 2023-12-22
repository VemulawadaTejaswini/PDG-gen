public class Main {
			
				
				public static void main(String[] args) {
					java.util.Scanner scan = new java.util.Scanner(System.in);
				int x;
				int i = 1;
		
				while(true){
					x = scan.nextInt();
					if(1<=x && x<= 10000){
					System.out.println("case "+i+" : "+x);
					i+= 1;
					}
				if(x == 0){
					break;
				}
				}
				}
				
				
				
				}