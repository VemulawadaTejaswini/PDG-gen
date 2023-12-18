import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		//数列の長さ
		int N=sc.nextInt();
		//各数字の数値
		ArrayList<Integer>numberArrayList=new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			numberArrayList.add(sc.nextInt());
		}
			
		int max=Collections.max(numberArrayList);
		for(int i=0;i<N;i++) {
			if(max==numberArrayList.get(i)) {
				Collections.sort(numberArrayList,Collections.reverseOrder());
				System.out.println(numberArrayList.get(1));
			}else {
				System.out.println(max);
			}
			
		}
	}

}
