import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static String getCharForNumber(long i) {
	    return i > 0 && i < 27 ? String.valueOf((char)(i + 'a' - 1)) : null;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int count=0;
		List<Long> list = new ArrayList<>();
		while(n!=0) {
			long a = n%26;
			list.add(a);
				n = n/26;
				count++;
		}
		for(int i=count-1; i>=0; i--) {
			System.out.print(getCharForNumber(list.get(i)));
		}
	}

}
