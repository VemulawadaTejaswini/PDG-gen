import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		String[] as = a.split("");
		String[] bs = b.split("");
		String[] cs = c.split("");
		int count = 0;
		for(int i=0; i<n; i++) {
			if(as[i].equals(bs[i]) && bs[i].equals(cs[i]) && as[i].equals(cs[i])) {
				continue;
			}else if(!as[i].equals(bs[i]) && !bs[i].equals(cs[i]) && !as[i].equals(cs[i])) {
				count += 2;
			}else {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
