import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		 int K = sc.nextInt();
		 String S = sc1.nextLine();
		 //Pattern p = Pattern.compile("^[^a-z]*$");
		 Pattern p = Pattern.compile("^[a-z]*$");
		 Matcher m = p.matcher(S);
		 boolean b = m.find();

		 //文字が英字かどうか
		 if(b){
			 if(1<=K && K<=100) {

				 if(1<=S.length() && S.length()<=100) {

					 if(S.length() >= K) {

						 System.out.println(S.substring(0,K)+ "...");
					 }
					 else if(S.length() <= K) {

						 System.out.println(S);
					 }

				 }
			 }
		 }
		 else {
			 System.out.println(m.find()+ "を返しました。");
		 }
		 sc.close();
		 sc1.close();
	}
}