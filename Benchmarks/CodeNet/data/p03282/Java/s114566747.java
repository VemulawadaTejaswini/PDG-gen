import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			// 文字列の入力
			String S = sc.next();
			String K = sc.next();
			String[] strArray = S.split("");

			if(K.equals("1")){
			    System.out.println(strArray[0]);
		   		sc.close();
			    return ;
			}
			if(strArray[0].equals("1")){
			    System.out.println(strArray[1]);
			}else{
			    System.out.println(strArray[0]);
			}
	   		sc.close();
		    return ;

		}
}
