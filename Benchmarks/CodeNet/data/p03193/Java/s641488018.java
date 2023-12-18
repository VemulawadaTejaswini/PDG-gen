import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int h = scan.nextInt();
		int w = scan.nextInt();
		int num = 0;
		for(int i = 0 ; i < n; i++){

			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x >= h && y >= w) num++;
		}
		System.out.println(num);
	}
}
