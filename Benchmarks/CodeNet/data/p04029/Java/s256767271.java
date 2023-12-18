import java.util.*;

public class Main {

    public static int sum(int n){
        return (1+n)*n/2;
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		System.out.println(sum(a));
	}
}
