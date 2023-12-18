import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		String[] str = scan.nextLine().split(" ");
		int[] tmp = new int[str.length];
		int sum = 0;
		int cnt = 0;
		for(int i = 0; i < str.length; i++){
			tmp[i] = Integer.parseInt(str[i]);
		}
		sum = tmp[0];
		for(int i = 1; i < tmp.length; i++){
			if(sum >= 0){
				if(sum + tmp[i] >= 0){
					cnt = cnt + Math.abs(sum + tmp[i]) + 1;
					sum = -1;
				}else{
					sum += tmp[i];
				}
			}else if(sum < 0){
				if(sum + tmp[i] <= 0){
					cnt = cnt + Math.abs(sum + tmp[i]) + 1;
					sum = 1;
				}else{
					sum += tmp[i];
				}
			}
		}
		System.out.println(cnt);
	}

}
