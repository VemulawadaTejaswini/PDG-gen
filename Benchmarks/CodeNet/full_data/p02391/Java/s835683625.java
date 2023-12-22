
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        String line = new java.util.Scanner ( System.in ).nextLine();
        String[] number = line.split(" ", 0);

        String answer = Compare(parseInt(number[0]),parseInt(number[1]));
        System.out.println(answer);
    }
    public static String Compare(int x,int y){
        if ( x < y ) { 
            return "a < b";
        }
        if ( x > y ) { 
            return "a > b";
        }
        if ( x == y ) { 
            return "a == b";
        }
        return null;
    }
}