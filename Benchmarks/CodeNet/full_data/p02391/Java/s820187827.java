import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            StringBuilder str = new StringBuilder();

            while(st.hasMoreTokens()) {
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if(x < y) {
                	str.append(x).append("<").append(y);
                }
                else if(x > y) {
                	str.append(x).append(">").append(y);
                }
                else {
                	str.append(x).append("==").append(y);
                }
            }
            System.out.println(str);
    }
}