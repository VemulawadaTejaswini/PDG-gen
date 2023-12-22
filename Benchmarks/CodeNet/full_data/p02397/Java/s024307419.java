public class Main {
			
				
		public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x;
		int y;
		int i;
		int t = 0;
		do{
		x = scan.nextInt();
		y = scan.nextInt();
		if(0<x && x<=10000 && 0<y && y<=10000){
			if(x<=y){
			System.out.println(x+" "+y);
			}else{
				i = x;
				x = y;
				y = i;
				System.out.println(x+" "+y);
			}
		}t++;
		if(x == 0 && y == 0){
			break;
		}
		}while(t <= 3000);
		}
		
					
					
					
		}