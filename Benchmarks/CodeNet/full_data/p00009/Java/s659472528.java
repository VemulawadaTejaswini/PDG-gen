import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while ((s = br.readLine()) != null) {
            if(s.length()==0) break;
            int a = Integer.valueOf(s);

            int sosu = 0;
            for(int j = 2; j<=a ; j++) {
                boolean flg = true;

                for(int k = 2; k<=100 ; k++) {
                    if(j%k==0) {
                        flg = false;
                        break;
                    }
                }
                if(flg) sosu++;
            }
            System.out.println(sosu);
        }
    }
}