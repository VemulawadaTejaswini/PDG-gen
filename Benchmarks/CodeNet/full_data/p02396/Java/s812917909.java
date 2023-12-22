import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1ITP13B {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
        int idx = 1;
        String str;
 
        StringBuilder output = new StringBuilder();
        try {
 
            while(true){
                str = br.readLine();
                if (str.equals("0")) {
                    break;
                } else {
                    output.append("Case ").append(String.valueOf(idx))
                            .append(": ").append(str).append("\n");
                }
                if (idx % 100 == 0) {
                    System.out.print(output.toString());
                    output.setLength(0);
                }
                idx++;
            }
            if (output.length() > 0) {
                System.out.print(output.toString());
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}