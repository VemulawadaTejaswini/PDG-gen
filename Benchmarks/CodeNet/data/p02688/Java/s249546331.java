import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int member = sc.nextInt();  //すぬけの人数
		int sweet = sc.nextInt();  //お菓子の種類数
		int result = 0;  //いたずらされる人数
		int[] brother = new int[member];  //誰が何個持っているかを入れる箱

//
		for(int i=0 ; i<sweet ; i++) {
			int num = sc.nextInt();
			for(int j=0 ; j<num ; j++) {
				int sunuke = sc.nextInt();
				brother[sunuke-1] += 1;
			}
		}
//
		for(int i=0 ; i<member ; i++) {
			if(brother[i]==0) {
				result++;
			}
		}
		System.out.print(result);
	}
}