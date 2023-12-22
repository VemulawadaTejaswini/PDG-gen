import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int W = input.nextInt();
        int H = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int r = input.nextInt();
        if (((x + r) <= W) && ((x - r) >= 0) && ((y + r) <= H) &&((y - r) >= 0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
