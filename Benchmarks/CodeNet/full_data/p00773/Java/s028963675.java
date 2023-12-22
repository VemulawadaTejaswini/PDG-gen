
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        while(true){
            String[] line = reader.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            float y = (float)Integer.parseInt(line[1]);
            int s = Integer.parseInt(line[2]);
            if(x==0 && y==0 && s==0){
                break;
            }
            int max = 0;
            for(int i=1; i<s*100/(100+x)+1; i++){
                int _i = (int)Math.floor(i*(100+x)/100);
                int j = s - _i;
                while((int)Math.floor(i*(100.0+x)/100)+(int)Math.floor(j*(100.0+x)/100) > s) {
                    j--;
                }
                if((int)Math.floor(i*(100.0+x)/100)+(int)Math.floor(j*(100.0+x)/100) != s) continue;
                int tmp = (int)(Math.floor(i*(100f+y)/100)+Math.floor(j*(100f+y)/100));
                if(max < tmp) max = tmp;
            }
            System.out.println(max);
        }
    }
}