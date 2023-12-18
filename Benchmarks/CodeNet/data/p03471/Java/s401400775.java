import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        int n = 0;
        long m = 0L;
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            String[] s = str.split(" ");
            n = Integer.parseInt(s[0]);
            m = Long.parseLong(s[1]);
        } catch (IOException e){
            e.printStackTrace();
        }

        int x,y;
        boolean flg=true;
        m = m / 1000;
        if(m > 20000){
            System.out.println("-1 -1 -1");
        } else{
            int z1 = (int)m % 5;
            n -= z1;
            m = m - z1;
            for (x = 0;x <= n;x++){
                for(y = 0;y <= n;y++){
                    if((10 * x + 5 * y + (n - x - y)) == m){
                        System.out.println(x + " " + y + " " + (n-x-y+z1));
                        flg = false;
                        break;
                    }
                }
                if(!flg){
                    break;
                }
            }
            if(flg){
            System.out.println("-1 -1 -1");
            }
            
        }
    }
}