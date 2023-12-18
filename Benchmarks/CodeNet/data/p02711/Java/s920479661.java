import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        if(N.substring(0,1).equals("7"))
            System.out.println("Yes");
        else if(N.substring(1,2).equals("7"))
            System.out.println("Yes");
        else if(N.substring(2,3).equals("7"))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
