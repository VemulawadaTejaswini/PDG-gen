import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(S == "RRS" || S == "SRR") {
			System.out.println("2");
		}else if(S == "RSR") {
			System.out.println("1");
		}
	}
}