
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String S = sc.next();
		sc.close();


		StringBuffer sb = new StringBuffer(S);
		String T = sb.reverse().toString();

		//System.out.println(sb.reverse().toString());

		boolean flag = true;
		for(int i = 0 ; i < T.length() ; i++){
			if(T.substring(i, i+5).equals("maerd") ||T.substring(i, i+5).equals("esare")){
				//System.out.println(T.substring(i, i+5));
				i +=4;
			}
			else if(T.substring(i, i+6).equals("remaerd") || T.substring(i, i+6).equals("resare")){
				//System.out.println(T.substring(i, i+6));
				i += 5;
			}
			else{
				flag = false;
				break;
			}
		}

		if(flag){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}


	}

}
