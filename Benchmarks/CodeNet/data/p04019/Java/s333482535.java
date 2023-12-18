import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String S =scan.next();
		boolean ans1=false;
		boolean ans2=false;

		if(S.contains("W")){
			//Wが含まれている
			if(S.contains("E")){
				ans1 = true;
			}
		}else{
			//Wが含まれていない
			if(!S.contains("E")){
				ans1 = true;
			}
		}

		if(S.contains("N")){
			//Wが含まれている
			if(S.contains("S")){
				ans2 = true;
			}
		}else{
			//Wが含まれていない
			if(!S.contains("S")){
				ans2 = true;
			}
		}

		if(ans1&&ans2){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}
