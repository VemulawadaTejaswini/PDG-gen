import java.util.Scanner;
public class five_antennas {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long start = System.currentTimeMillis();
		Scanner read = new Scanner(System.in);
		int[] antenna = new int[5];
		for(int i = 0;i < 5;i++) {
			antenna[i] = read.nextInt();
		}
		int k = read.nextInt();
		boolean flag = true;
		for(int i = 0;i < 4;i++) {
			for(int j = i+1;j < 5;j++) {
				if(antenna[j] - antenna[i] > k) flag = false;
			}
		}
		if(flag) System.out.println("Yay!");
		else System.out.println(":(");
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}
}
