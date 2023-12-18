import java.util.Scanner;

public class Main {

	public static boolean isSort(int[] list){
		for(int i=0;i<list.length-1;i++) {
			if(list[i] > list[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean Sort(int[] list){

		for(int i = list.length - 1;i>0;i--) {
			if(list[i] < list[i-1] ) {
				list[i-1] -= 1;
				if(list[i] < list[i-1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		if(isSort(array) || Sort(array)) {
			System.out.println("Yes");
		}else  {
			System.out.println("No");
		}


		sc.close();
	}

}
