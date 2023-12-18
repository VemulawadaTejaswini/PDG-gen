import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scanner.nextInt();
        String rb = scanner.next();
        int red = 0;
        for(int i = 0; i < rb.length(); i++){
            if(rb.charAt(i) == 'R'){
                red++;
            }
        }
        if(red > rb.length()/2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
