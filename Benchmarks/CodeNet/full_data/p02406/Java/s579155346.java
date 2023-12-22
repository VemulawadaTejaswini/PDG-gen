import java.util.*;

class Main{
	public static void main(String args[]){
		int x;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		x = scan.nextInt();

		while(true){
			num += 3;
			if(x < num){
				break;
			}
			sb.append(" " + num);
		}
		System.out.println(sb);
	}
}