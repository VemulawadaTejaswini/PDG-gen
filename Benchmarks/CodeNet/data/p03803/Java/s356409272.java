import java.util.Scanner;

public class Main {
	static String[] Lb;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] L = line.split(" ");

       System.out.println(isWinA(L[0], L[1]));
	}

	private static String isWinA(String A,String B){
		int a =Integer.parseInt(A);
		int b = Integer.parseInt(B);
		if(a != 1 && b != 1){
			if(Integer.parseInt(A) > Integer.parseInt(B)){
				return "Alice";
			}else if(Integer.parseInt(A) == Integer.parseInt(B)){
				return "Draw";
			}else{
				return "Bob";
			}
		}else{
			if( a == 1 && b == 1){
				return "Draw";
			}else{
				if(a == 1){
					return "Alice";
				}
				if(b == 1){
					return "Bob";
				}
			}
			return "";
		}
	}
}