import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] line = new int[n];
		
		for(int i = 0; i < line.length; i++)
			line[i] = sc.nextInt();
		
		int count = 0;
		for(int i = 2; i < line.length; i++) {
			if(line[i-2] != line[i]) {
				line[i] = line[i-2];
				count++;
			}
		}
		
		System.out.println(count);
	}

}
