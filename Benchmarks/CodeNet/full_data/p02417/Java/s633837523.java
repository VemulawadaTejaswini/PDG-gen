import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int[] alpha_int = new int[26];

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String strStdIn = in.readLine();
        while(strStdIn!=null){ //EOF?????§???????¶??¶?
            //??????????¨????
            strStdIn = in.readLine();
        }


        int length1 = 0;
		int length2 = 0;
        
		// ArrayList<String> list = new ArrayList<String>();
		// Scanner sc = new Scanner(System.in);

		// while (true) {
		// String s = sc.nextLine();
		// list.add(s);

		// 	if (s.contains(".")) {
		// 		break;
		// 	}

			// ????????????????????¶????????§??±???

		// }
		
		for (int i = 0; i < strStdIn.length(); i++) {
			String s = strStdIn;
			length1 = s.length();
			for (int j = 0; j < 26; j++) {
				s = s.toLowerCase();
				s = s.replaceAll(alpha[j],"");
				length2 = s.length();
				alpha_int[j] += length1 - length2;
				s = strStdIn;
			}
		}

		// for (int i = 0; i < list.size(); i++) {
		// 	String s = list.get(i);
		// 	length1 = s.length();
		// 	for (int j = 0; j < 26; j++) {
		// 		s = s.toLowerCase();
		// 		s = s.replaceAll(alpha[j],"");
		// 		length2 = s.length();
		// 		alpha_int[j] += length1 - length2;
		// 		s = list.get(i);
		// 	}
		// }

		for (int i = 0; i < 26; i++) {
			System.out.print(alpha[i]);
			System.out.print(" : ");
			System.out.println(alpha_int[i]);
		}
	}

}