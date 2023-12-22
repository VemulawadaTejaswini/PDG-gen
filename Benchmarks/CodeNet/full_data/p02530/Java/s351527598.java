import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0, taro_cnt = 0, hanako_cnt = 0;

		n = sc.nextInt();

		for(int i = 0;i < n;i++){
			int result = 0;
			if((result = (sc.next()).compareTo(sc.next())) == 0){
				taro_cnt++;
				hanako_cnt++;
			} else if(result > 0){
				taro_cnt += 3;
			} else {
				hanako_cnt += 3;
			}
		}
		System.out.println(taro_cnt + " " + hanako_cnt);
	}
}