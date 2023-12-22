import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            while(line != "") {
            	int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

            	if(x < y) {
            		x = x + y;
                	y = x - y;
                	x = x - y;

            	}

            	while(y > 0) {
            		int r = x % y;
            		x = y;
            		y = r;
            	}
            	System.out.println(x);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}