import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count =0;
		int max =0;
		for (int i=0;i<s.length();i++) {
			if (s.equal("A")||s.equal("C")||s.equal("G")||s.equal("T") {
				count ++;
				if (max<count) {
					max = count;
				}
			} else {
				count =0;
			}
		}
		System.out.println(max);
	}
}