import java.util.Scanner;
class Main{
	public static void main(String[] args){
		for(int i=0; i<10001 ;i++){
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			if(x==0){
				break;
			}
			else{
				System.out.println("Case "+i+": "+x);
			}
		}
	}
}