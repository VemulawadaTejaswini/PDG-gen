import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt(); //a個口の電源タップ
		int aa = a-1; //aの値保管用
		
		int b = stdIn.nextInt(); //b以上に拡張したい
		int count = 1; //電源タップの数のカウント
		
		do{
			a+=aa;
			count++;
		}while(a<b);
		
		System.out.println(count);
		
		
		
		
		
	}

}
