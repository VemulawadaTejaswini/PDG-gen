import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Inversions(num, scanner);

	}

	public static void Inversions(int num, Scanner sc) { 
		int count = 0;
		int work;
		List<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0; i < num; i ++ ){
			array.add(sc.nextInt());
		}
		//バブルソート処理
		for (int i = 0; i < num - 1; i++) {
			for (int j = num - 1; j > i; j--) {
				if ( array.get(j - 1) > array.get(j) ) {
					work = array.get(j - 1);
					array.set(j - 1,array.get(j));
					array.set(j,work);
					count ++;
				}
			}
		}
        System.out.print(count);
	}
}
