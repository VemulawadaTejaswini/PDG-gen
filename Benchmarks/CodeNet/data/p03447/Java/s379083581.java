import java.util.*;
public class Main {
	public static void main(String[] args){
    //データ取り込み
		Scanner sc = new Scanner(System.in);
		//String S = sc.next();
    //int B = sc.nextInt();
    //System.out.println();
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println((X-A)%B);
	}
}