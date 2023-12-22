import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        int temp = 0;
        for (int i = 0; i < T.length(); i++) {
            for (int j = T.length(); j > i; j--) {
                String str = T.substring(i, j);
                String tmp = S.substring(i, S.length()-(T.length()-j));
                if (tmp.contains(str)) {
                	if (str.length() > temp) {
                    	temp = j-i;
                	}
                }
            }
        }

        System.out.println(T.length() - temp);
    }
}