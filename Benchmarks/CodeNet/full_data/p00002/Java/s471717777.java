import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            String s;
 
            while ((s = br.readLine()) != null && list.size() <= 200) {
 
                String[] num = s.split(" ");
                if (0 <= Integer.parseInt(num[0])
                        && Integer.parseInt(num[1]) <= 1000000) {
                    int sum = Integer.parseInt(num[0])
                            + Integer.parseInt(num[1]);
                
                    System.out.println(Integer.toString(sum).length());
                }else {
                    break;
                }
            }

        } finally {
            br.close();
        }
 
    }
}