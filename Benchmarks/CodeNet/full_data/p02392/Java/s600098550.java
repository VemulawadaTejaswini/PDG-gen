import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String param[] = input.split(" ");
        
        int a = Integer.parseInt(param[0]);
        int b = Integer.parseInt(param[1]);
        int c = Integer.parseInt(param[2]);
        if(a < b && b < c){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}