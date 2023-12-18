import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==1)
        {
            System.out.println(num/2+1);
        }
        else
        {
            System.out.println(num/2);
        }
    }
}