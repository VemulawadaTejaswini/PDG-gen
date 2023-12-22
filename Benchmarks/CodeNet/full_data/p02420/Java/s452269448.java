import java.util.Scanner;

//import jdk.internal.org.jline.utils.InputStreamReader;

//import java.io.*;

public class Main{
        public static void main(final String[] args){
            Scanner scanner = new Scanner(System.in);
            while(true){
                String cards = scanner.next();
                if(cards.equals("-")){
                    break;
                }
                int m = scanner.nextInt();
                int sum = 0;
                for(int i = 0; i < m; i++){
                    int h = scanner.nextInt();
                    cards = cards.concat(cards.substring(sum, sum + h));
                    sum += h;
                }
                System.out.println(cards.substring(sum));
            }
            scanner.close();
        }
         

}
