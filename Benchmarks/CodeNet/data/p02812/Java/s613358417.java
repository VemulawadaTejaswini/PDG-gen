import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = scan.next();
		int cnt = 0;
		String[] array = new String[num];
		for(int i = 0;i < num;i++) {
			array[i] = Integer.toString(str.charAt(i+1));
		}
		for(int i = 0;i < -2 + num;i++) {
			if(array[i].equals("B") && array[i+1].equals("B") && array[i+2].equals("C")) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		scan.close();
	}
}