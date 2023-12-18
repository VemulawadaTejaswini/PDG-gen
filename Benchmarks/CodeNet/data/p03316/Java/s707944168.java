import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = sc.nextInt();
      int n = a;
	 int b = a%10;
while(a/10 != 0){
    a = a/10;
    b += a;
}
      if(n%b==0){
		System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}