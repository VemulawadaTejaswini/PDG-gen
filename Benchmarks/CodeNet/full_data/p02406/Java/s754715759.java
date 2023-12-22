import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO ??????????????????????????????????????¨?????¨????????????????????????

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String strN = Integer.toString(n);

        for(int i = 0; i < n; i++){
            if(i % 3 == 0 || strN.indexOf("3") != -1){
                output.append(" ").append(i);
            }
        }
        System.out.println(output);
    }

}