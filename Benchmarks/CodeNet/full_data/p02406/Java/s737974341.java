import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();

		for(int i=1;i<=x;i++) {
			String tmp = Integer.toString(i);
			if(i%3==0 || tmp.contains("3")) {
				array.add(i);
			}
		}

		for(int i=0;i<array.size();i++) {
			System.out.print(array.get(i));
			if(i!=array.size()-1) {
				System.out.print(" ");
			}
		}

		sc.close();
	}
}
