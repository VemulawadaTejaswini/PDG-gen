import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while(sc.hasNext()){
            String[] inputstr = sc.nextLine().split(" ");
            Arrays.sort(inputstr);
            int inputnum = Integer.parseInt(inputstr[0]);
            int inputnum2 = Integer.parseInt(inputstr[1]);
            int inputnum3 = Integer.parseInt(inputstr[2]);
            System.out.println(inputnum+" "+inputnum2+" "+inputnum3);
        }
    }
}