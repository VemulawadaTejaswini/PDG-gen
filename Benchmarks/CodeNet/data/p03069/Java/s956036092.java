import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字数の取得
		int a = sc.nextInt();
		// 文字列の取得
		String stone = sc.next();
		
		//#.の文字列の出現回数を調べたい
		String dameword = "#.";
		
		// #.文字列と一致したらカウントする
		int count =0;
		for(int i = 0; i<a-1; i++){
			if(dameword.equals(stone.substring(i,i+2))){
				count = count + 1;
			}else{
			}
		}
		System.out.println(count);
	}
}