import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		int line[] = new int[n];
		int temp = 0;
		int exchange = 0;

		for(int i=0; i<n; i++){
			line[i] = Integer.parseInt(std.next());
		}
		boolean flag = true;
		while (flag){
			flag = false;
			for(int j=(n-1); j>0; j--){
				if (line[j] < line[j-1]){
					temp = line[j]; line[j] = line[j-1]; line[j-1] = temp;
					exchange++;
					flag = true;
				}
			}
		}
		String outsd = Integer.toString(line[0]);
		for(int i=1; i<n; i++){
			outsd += " "+line[i];
		}
		System.out.println(outsd);
		System.out.println(exchange);
	}
}