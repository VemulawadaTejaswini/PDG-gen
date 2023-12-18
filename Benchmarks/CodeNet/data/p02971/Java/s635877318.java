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
		Collections.sort(numberArrayList,Collections.reverseOrder());
		int max=numberArrayList.get(0);
		
		for(int i=0;i<N;i++) {
			if(max==numberArrayList.get(i)) {
				System.out.println(numberArrayList.get(1));
			}else {
				System.out.println(max);
			}
			
		}
	}

}
