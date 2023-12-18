import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		Long N = sc.nextLong();
		Long conX = new Long(1000000000);
        Long x = (conX - N % conX) % conX;
		Long y = (N + x) / conX;
		
		System.out.println("0 0 1000000000 1 " + x + " " + y);
	}
}