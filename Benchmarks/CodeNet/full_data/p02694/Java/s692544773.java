import java.util.*;

public class Main {
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Long X = sc.nextLong();
		Long base = (long) 100;
		int cnt = 0;

		while (true){
			base = (long) Math.floor(base*1.01);
			cnt++;
			if(base>=X){
				System.out.println(cnt);
				return;
			}
			continue;
		}
	}


}
