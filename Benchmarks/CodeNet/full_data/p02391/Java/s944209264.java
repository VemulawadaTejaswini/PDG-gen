import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        if(a < b)
            System.out.println("a < B");
        if(a > b)
            System.out.println("a > B");
        if(a == b)
            System.out.println("a == B");
    }
}