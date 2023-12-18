import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String line = readLine();
        String WA = "WA";
        String AC = "AC";

        if (line.startsWith("A")) {
            if (line.substring(0, 2).indexOf("C") != -1 || line.endsWith("C") ) {
                System.out.println(WA);
                return;
            }
            if (line.replace("C", "").length() != line.length() - 1) {
                System.out.println(WA);
                return;
            }

            String str1 = line.replace("A", "");
            String str2 = str1.replace("C", "");
            if (str2.equals(str2.toLowerCase())) {
                System.out.println(AC);
            } else {
                System.out.println(WA);
            }
        } else {
            System.out.println(WA);
        }
    }

    private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}
}