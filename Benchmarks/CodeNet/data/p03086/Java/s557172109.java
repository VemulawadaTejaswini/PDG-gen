import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] List = s.split("");
		int count =0;
		int max =0;
		for (int i=0;i<s.length();i++) {
			if (List[i].equal("A")||List[i].equal("C")||List[i].equal("G")||List[i].equal("T") {
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