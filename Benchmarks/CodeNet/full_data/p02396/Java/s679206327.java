import java.util.Scanner;
class Main{
	public static void main(String[] args){
	int i = 1;
	Scanner scan = new Scanner(System.in);
		while(i==10000){
			
			int x = scan.nextInt();
			if(x == 0){
				break;
			}
			else{
				System.out.println("Case "+i+": "+x);
			}
			i += 1;
		}
	}
}