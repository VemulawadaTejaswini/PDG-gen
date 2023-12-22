import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int output = (int) Math.ceil(360/x);
        
        System.out.println(output);
    }
}
