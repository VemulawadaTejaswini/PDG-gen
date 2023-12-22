import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        String ans = "No";
        for (int i = 0; i < x+1; i++){
            if (i*2 + (x-i)*4 == y){
                ans = "Yes";
            }
        }
        System.out.println(ans);
    }
}