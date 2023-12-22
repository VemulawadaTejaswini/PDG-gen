import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long total = 1;
		for(int i = 0;i < n;i++) {
			long y = sc.nextLong();
			total *= y;
		}
		if(total > 1000000000000000000l) {
			System.out.println(-1);
		}else {
			System.out.println(total);
		}
  }
}