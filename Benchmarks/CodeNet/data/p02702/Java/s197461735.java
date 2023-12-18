import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count =0;
		for(int i =s.length()-1; i>=0;i--) {
			for(int j = i-4; j>=0;j--) {
				long num = Long.parseLong(s.substring(j, i+1));
				if(num%2019 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}