import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		ArrayList<String> array = new ArrayList<String>();
		for(int i = 0;i<N;i++){
			String str = scanner.next();
			array.add(str);
			//System.out.println(str);
		}
		if(array.contains("Y")){
			System.out.println("Four");
		}else{
			System.out.println("Three");
		}
		//int B = scanner.nextInt();
		//String S = scanner.nextLine();
		scanner.close();
	}
}
