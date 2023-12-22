import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int w = s.nextInt();
        int h = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        int r = s.nextInt();
        
        //
        String result = "";
        if ( 0 <= x-r && x+r <= w && 0 <= y-r && y+r <= h ) {
            result = "Yes";
        } else {
            result = "No";
        }
        System.out.println(result);
        
    }
}
