import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String buff = s.substring(0,s.length()-2);
		int next =1;

		for(int i=0;i<s.length()-2;i++) {
			if(buff.length()%2==0&&buff.substring(0,buff.length()/2-1).equals(buff.substring(buff.length()/2,buff.length()-1))) {
				System.out.println(buff.length());
				break;
			}
			buff=buff.substring(0,buff.length()-2);
		}
		
		//System.out.println(-1);
	}
	public static int sample() {
		return 1;
	}

}
