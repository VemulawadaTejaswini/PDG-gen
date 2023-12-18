import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int min = 100000;
		
		for(int i = (int) Math.ceil(a/0.08);i <= (int)Math.ceil((a+1)/0.08)-1;i++){
			if(i*0.1 == b){
				min = i;
				break;
			}
		}
		
		for(int i = (int) Math.ceil(b/0.1);i <= (int)Math.ceil((b+1)/0.1)-1;i++){
			if(i*0.08 == a){
				min = Math.min(i,min);
				break;
			}
		}
		
		System.out.println(min == 100000 ? -1 : min);
	}
}