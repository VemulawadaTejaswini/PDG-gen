import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> sosuList = new ArrayList<Integer>();
        String s;
        while ((s = br.readLine()) != null) {
            if(s.length()==0) break;
            int a = Integer.valueOf(s);
            int sosu = 0;
            loop : for(int j = 2; j<=a ; j++) {
                boolean flg = true;

                for(Integer i : sosuList) {
                    if(j%i==0) {
                        flg = false;
                        break;
                    }
                }
                if(flg) {
                    sosuList.add(j);
                    sosu++;
                }
            }
            System.out.println(sosuList.size());
        }
    }
}