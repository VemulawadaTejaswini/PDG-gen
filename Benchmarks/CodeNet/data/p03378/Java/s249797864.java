
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        String buffer = br.readLine();
        String a[] = buffer.split(" ", 0);
        int lo = 0, hi = 0;
        for (String oki : a) {
            if(Integer.parseInt(oki)<x){
                lo++;
            }else{
                hi++;
            }
        }
        if(lo<hi){
            System.out.println(lo);
        }else{
            System.out.println(hi);
        }
    }
}
