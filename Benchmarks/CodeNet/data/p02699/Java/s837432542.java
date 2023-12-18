import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int w = input.nextInt();
        if (s <= w){
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}