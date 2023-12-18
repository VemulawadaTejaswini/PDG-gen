import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String line = readLine();
        String subLine;
        if(line.length()%2 == 0){
            subLine = line.substring(0, line.length()-2);
        } else {
            subLine = line.substring(0, line.length()-1);
        }
            
        for (int i = 0; i < subLine.length(); i = i + 2) {
            int len = subLine.length();
            String before = subLine.substring(0, len / 2);
            String after = subLine.substring(len / 2, len);
            if (before.equals(after)) {
                System.out.println(subLine.length());
                return;
            } else {
                subLine = subLine.substring(0, subLine.length() - 2);
            }
        }
        System.out.println(subLine.length()+1);
        return;
    }

    private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}
}