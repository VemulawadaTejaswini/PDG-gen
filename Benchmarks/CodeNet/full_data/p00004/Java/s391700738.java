import java.io.BufferedReader;
import java.io.InputStreamReader;
  
public class Main {
  
    public static void main(String[] args) throws Exception {
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        while(str != null){
            String lns[] = str.split(" ");
            int a = lns[0];
            int b = lns[1];
            int c = lns[2];
            int d = lns[3];
            int e = lns[4];
            int f = lns[5];

            System.out.println(a + " " + b + " " + c +  " " + d +  " " + e + " " + f );
        }
        // System.out.println(String.format("%d:%d:%d", hour, min, sec));
    }
}