import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int sheep = in.nextInt();
        int wolves = in.nextInt();
        if(wolves >= sheep)
        {
            System.out.println("unsafe");
        }
        else
        {
            System.out.println("safe");
        }
    }
}
