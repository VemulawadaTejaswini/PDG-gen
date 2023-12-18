import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String args[]) throws Exception{
        String[] s = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        if((s[0].charAt(s[0].length() - 1) & 1) == 0 || (s[1].charAt(s[1].length() - 1) & 1) == 0){
          System.out.println("Even");
        } else {
          System.out.println("Odd");
        }
    }
}