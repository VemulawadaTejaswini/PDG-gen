import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      //数字の数を入力
		int k = sc.nextInt();
		String s = sc.next();
	  //
      int sLen = s.length();
      if(sLen <= k){
        System.out.println(s);
      }else{
        System.out.println(s.substring(0,k)+ "...");
      }
	}

}
