import java.util.Scanner;
class Main{
	public static void main(String[] args){
		for(int i=1; i==0 ;i++){
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			if(x == 0){
				break;
			}
			else{
				System.out.println("Case "+i+": "+x+"\r\n");
			}
		}
	}
}