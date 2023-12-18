import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		Long W = sc.nextLong();
      Long H = sc.nextLong();
      Long x = sc.nextLong();
      Long y = sc.nextLong();
      double S = W * H / 2;
      String isCenter = "0";
      if(x == W / 2 && y == H / 2){
        isCenter = "1";
      }
      System.out.println(S + " " + isCenter);
	}
}
