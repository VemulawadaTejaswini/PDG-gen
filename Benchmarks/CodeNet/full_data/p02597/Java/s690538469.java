import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		char[] input = sc.next().toCharArray();
		int count = 0;
		for(int i=0;i<N;i++) {
			if(input[i]== 'R'&&i>1&& input[i-1]== 'W') {
				for(int j=0;j<i;j++) {
					if(input[j]== 'W') {
						input[j] = 'R';
						input[i] = 'W';
						count = count + 1;
						break;
					}
				}
				
			}
		}
		System.out.println(count);
		

	}

}