import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		long n = sc.nextLong();
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String ans = "";
      	long syou = n;
      	long amari = 0;

        for(int i = 0; syou !=0; i++){
          	amari = syou % 26;
			syou = syou /26;
            ans = String.valueOf(alphabet[(int)amari -1]) + ans;
          
        }

		System.out.println(ans);
	}
}