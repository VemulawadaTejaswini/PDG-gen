import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.equals("2019/04/30"))
            System.out.println("Heisei");
        else
            System.out.println("TBD");



    }
}
