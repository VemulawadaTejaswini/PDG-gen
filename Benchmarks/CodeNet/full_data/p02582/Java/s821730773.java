
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                int count=1;
                String rain;
                rain=scan.nextLine();
                if(rain.charAt(0)=='S' && rain.charAt(1)=='S' && rain.charAt(2)=='S'){
                    System.out.print(0);
                }else {
                    for (int i = 1; i < rain.length(); i++) {
                        if (rain.charAt(i) == 'R' && rain.charAt(i - 1) == 'R') {
                            count++;
                        }
                    }
                    System.out.print(count);
                }
    }
}
