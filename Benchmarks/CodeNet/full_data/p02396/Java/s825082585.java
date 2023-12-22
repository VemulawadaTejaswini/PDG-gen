import java.util.*;

class Main{
	public static void main(String args[]){
		int con = 1;
		Scanner scan = new Scanner(System.in);
		while(true){
			int num = scan.nextInt();
			if(num!=0){
				System.out.println("Case " + con + ": " + num);
				con++;
			}
			else{
				break;
			}
		}
	}
}