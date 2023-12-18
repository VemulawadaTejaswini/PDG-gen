import java.util.ArrayList;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i= 0;i < N;i++){
			list.add(scan.next());
		}
		
		for(int i = 1;i < N;i++){
			int size = list.get(i-1).length();
			if(list.get(i).charAt(0) != list.get(i-1).charAt(size-1)){
				System.out.println("No");
				return;
			}
			for(int j = 0;j < i;j++){
				if(list.get(i).equals(list.get(j))){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");


	}
}
