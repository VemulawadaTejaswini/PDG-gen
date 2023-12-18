import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int counter = 0;
		for(int i = 0; i < num; i++){
			numList.add(scan.nextInt());
		}
		boolean plusflg = false;
		for(int i = 0; i < num; i++){
			int A = numList.get(i);
			if(plusflg){
				A += 1;
				plusflg = false;
			}
			if(A % 2 == 0){
				counter += A / 2;
			}else{
				counter += A / 2;
				plusflg = true;
			}
		}
		System.out.println(counter);
	}
}