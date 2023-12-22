import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int X=sc.nextInt();
        int Y=sc.nextInt();
        if(2*X<=Y&&4*X>=Y&&Y%2==0){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
}
}