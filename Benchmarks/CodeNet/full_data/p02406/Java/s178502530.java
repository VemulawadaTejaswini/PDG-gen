import java.util.*;
class Main{
	public static void main(String args[]){
		int n = 3;
		int i;
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		i = scan.nextInt();
		while(true){
			if(i < n){
		        break;
			}
			if(n % 3 == 0 || Integer.toString(n).contains("3")){
				System.out.printf(" " + n);
			}
			n++;
		}
		System.out.println(sb);
	}
}