
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] strArray = str.split(" ");
        int x, y;

        while(true) {
        	str = br.readLine();
            strArray = str.split(" ");

            if(strArray[0]=="0" && strArray[1]=="0") {
            	break;
            }

            x = Integer.parseInt(strArray[0]);
            y = Integer.parseInt(strArray[1]);

            System.out.println(Math.min(x, y) + " " + Math.max(x, y));
        }
	}
}