import java.util.Scanner;

class Main{
    public static void main(String[] arr)

    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.length() == 2)
            System.out.printf(a);
        else {
            String re = new StringBuffer(a).reverse().toString();
            System.out.printf(re);
        }
    
    }
}