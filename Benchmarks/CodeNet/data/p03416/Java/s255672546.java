import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i=x; i<=y; i++) {
        	String[] line = Integer.toString(i).split("");
        	if(line[0].equals(line[4]) && line[1].equals(line[3])) {
        		count++;
        	}
        }

        System.out.println(count);

        sc.close();
    }
}