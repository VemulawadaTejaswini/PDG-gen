import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String args[]){
      	Scanner sc = new Scanner(System.in);
      	String a = sc.nextLine();
        String[] b = a.split(" ");
        Arrays.sort(b);
        int p = (Integer.parseInt(b[1])-Integer.parseInt(b[0]))+(Integer.parseInt(b[2])-Integer.parseInt(b[1]));
        System.out.println(p);
    }
}