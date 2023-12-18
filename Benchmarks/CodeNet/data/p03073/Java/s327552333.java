import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] S = s.split("");

		int sum01 = 0;
		int sum10 = 0;
		int count = 0;

		for(String str:S){
			if(count%2==0){
				if(str.equals("0")){
					sum10++;
				}else{
					sum01++;
				}
			}else{
				if(str.equals("1")){
					sum10++;
				}else{
					sum01++;
				}
			}
			count++;
		}

		// 出力
		System.out.println(sum10<sum01?sum10:sum01);
	}
}