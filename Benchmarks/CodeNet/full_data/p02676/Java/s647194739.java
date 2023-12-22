import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K=sc.nextInt();
		String S=sc.next();
		sc.close();
		if(S.length()<=K) {
			System.out.println(S);
		}else {
			String[] name = S.split("");
			for(int i=0;i<K;i++) {
				System.out.print(name[i]);
			}
			System.out.print("...");
		}
	}
}
