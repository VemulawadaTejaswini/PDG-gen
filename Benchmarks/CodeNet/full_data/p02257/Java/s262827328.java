import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		int result = 0;
		for(int i=0 ; i<cnt ; i++) {
			int number = Integer.parseInt(s.nextLine());
			result += solve(number);
		}
		System.out.println(result);
	}

	public static int solve(int number) {
		boolean[] table = new boolean[number+1];
		int min = 2;
		for(int i=2 ; i<number ; i++) {
			if(!table[i])
				min = i;
			else
				break;

			for(int j=2 ; number>=j*min ; j++) {
				table[j*min] = true;
			}
		}
		if(table[number])
			return 0;
		else
			return 1;
	}

}