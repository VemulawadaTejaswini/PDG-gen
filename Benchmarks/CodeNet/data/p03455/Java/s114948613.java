import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        if((s[0].charAt(s[0].length() - 1)) & 0){
          System.out.println("Even");
        } else if((s[1].charAt(s[1].length() - 1)) & 0) {
          System.out.println("Even");
        } else {
          System.out.println("Odd");
        }
    }
}