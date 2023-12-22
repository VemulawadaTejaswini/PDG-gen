
import static java.lang.Integer.parseInt;

public class Main {
    public static void main (String[] args) {
        String line = new java.util.Scanner ( System.in ).nextLine();
        String[] number = line.split(" ", 0);
        String ans = Range(parseInt(number[0]),parseInt(number[1]),parseInt(number[2]));
        System.out.println(ans);
    }
    public static String Range(int x ,int y , int z){
        if (x < y && y < z) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
}