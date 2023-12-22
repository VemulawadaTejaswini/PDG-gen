import java.util.Scanner;
class Main{
	public static void main(String[] args){
	int i = 1;
	int t =0;
	Scanner scan = new Scanner(System.in);
		while(i==0){
			
			int x = scan.nextInt();
			int y = scan.nextInt();
						
			if(x == 0 && y ==0){
				break;
			}
			else{
				if(x>y){
					t=x;
					x=y;
					y=t;
				}
				System.out.println(x+" "+y);
				i += 1;
			}
			
		}
	}
}