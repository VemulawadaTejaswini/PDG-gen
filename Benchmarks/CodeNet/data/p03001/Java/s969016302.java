import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = Integer.parseInt(scan.next());
        int H = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        if (x/2 == W && y/2  == H){
            System.out.println(W*H/2 + " " + 1);
        }
        else{
            System.out.println(W*H/2 + " " + 0);
        }
    }
}