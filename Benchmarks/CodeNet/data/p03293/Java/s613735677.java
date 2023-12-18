import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();


		for(int i =0;i < S.length();i++){
			if(S.equals(T)){
				System.out.println("Yes");
				return;
			}else{
				T =  rotate(T);
			}
		}
		System.out.println("No");


	}

	static String rotate(String T){
		String aa = T.substring(1)+T.substring(0, 1);
		return aa;



	}


}






