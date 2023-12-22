import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 if(0<N && N<=999) {
			  String N2 =Integer.toString(N);
			  //文字列の最後尾から１文字取り出す。
			  N2 = N2.substring(N2.length() -1);
			 switch(N2.charAt(0)){
			 case '2':
			 case '4':
			 case '5':
			 case '7':
			 case '9':
				 System.out.println("hon");
				 break;
			 case '0':
			 case '1':
			 case '6':
			 case '8':
				 System.out.println("pon");
				 break;
			 case '3':
				 System.out.println("bon");
				 break;
			 }
			 sc.close();
		 }
	}
}