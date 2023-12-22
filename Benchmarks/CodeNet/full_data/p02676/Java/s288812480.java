import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();

        if(s.length() <= k){

        }else {
            StringBuilder sb = new StringBuilder();
            sb.append(s);

            sb.setLength(k);
            sb.append("...");
            s = sb.toString();
        }

        System.out.println(s);
    }
}
