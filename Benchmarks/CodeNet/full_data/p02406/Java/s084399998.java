import java.util.*;

class Main{
	public static void main(String args[]){
		int x;
		int num = 3;
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		x = scan.nextInt();

		while(true){
			if(x < num){
				break;
			}
			if(num % 3 == 0 || num % 10 == 3){
				sb.append(" " + num);
			}
			num++;
		}
		System.out.println(sb);
	}
}