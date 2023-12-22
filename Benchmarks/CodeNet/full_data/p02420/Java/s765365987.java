import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //StringBuilder bd = new StringBuilder();
        ArrayList<String> A = new ArrayList<String>();
        //int[] A = new int[26];
        //Arrays.fill(A, 0);
        //String str;

        while (true) {
            String str = sc.nextLine();
            String newstr = "";
            if (str.equals("-")) {
                for (int i=0; i<A.size(); i++) {
                    System.out.println(A.get(i));
                }
                break;
            }
            int m = sc.nextInt();
            int h = 0;
            for (int i=0; i<m; i++) {
                h += sc.nextInt();
            }
            while (h > str.length()) {
                h -= str.length();
            }
            for (int i=h; i<str.length(); i++) {
                newstr += str.substring(i, i+1);
            }
            for (int i=0; i<h; i++) {
                newstr += str.substring(i, i+1);
            }
            A.add(newstr);
            String dummy = sc.nextLine();
        }

    }
}
