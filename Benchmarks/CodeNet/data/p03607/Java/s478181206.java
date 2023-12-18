import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		int cnt = 0;
		for(int i=0;i<N;i++){
			String temp = sc.next();
			if(list.contains(temp)){
				list.remove(temp);
				cnt--;
			}else{
				list.add(temp);
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}