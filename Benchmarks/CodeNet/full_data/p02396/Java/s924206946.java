import java.util.Scanner;
class Main{
	public static void main(String[] args){
	int i = 0;
	int x;
		while(i>0){
			Scanner scan = new Scanner(System.in).useDelimiter("\n");
			x = scan.nextInt();
			if(x == 0){
				break;
			}
			else{
				System.out.println("Case "+i+": "+x);
			}
		}
	}
}