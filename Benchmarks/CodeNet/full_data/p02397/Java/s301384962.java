import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] strArray;
        int x, y;

        while(true) {
        	strArray = br.readLine().split(" ");

            x = Integer.parseInt(strArray[0]);
            y = Integer.parseInt(strArray[1]);

            if(x==0 && y==0) {
            	break;
            }

            sb.append(Math.min(x, y)).append(" ").append(Math.max(x, y)).append("\n");
        }

        System.out.println(sb);
	}
}