import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String s = sc.next();
		String[] S = s.split("");

		int count=0;
		int max=0;

		for(String str:S){
			if(str.equals("A")||str.equals("G")||str.equals("C")||str.equals("T")){
				count++;
			} else {
				if(count>max)max=count;
				count=0;
			}
		}
		if(count>max)max=count;

		// 出力
		System.out.println(max);
	}
}