import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ud = sc.next();
		char[] ch = ud.toCharArray();

		int sum = 0;
		for(int i = 0; i < ch.length; i++){
			for(int j = 0; j < ch.length; j++){
				sum += num(i, j, ch);
			}
		}
		System.out.println(sum);
	}

	public static int num(int from, int to, char[] ch){
		if(from == to)
			return 0;
		if((from < to && ch[from] == 'U') || (to < from && ch[from] == 'D'))
			return 1;
		else
			return 2;
	}
}