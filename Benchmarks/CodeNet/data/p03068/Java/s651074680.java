import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();


        n = s.length();

        String[] sArray = s.split("");

        for(int i = 0; i < n; i++) {
        	String m = sArray[k + 1];
        	if (m == sArray[i]) {
        		sArray[i] = m;


        	}else if (m != sArray[i]) {
        		sArray[i] = "*";
        	}
        }

    	System.out.println(s);

	}

}
