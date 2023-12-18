import java.util.Scanner;
public class TaskA{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int test=Integer.valueOf(sc.nextLine());
        if(test<1200)
            System.out.println("ABC");
        else if(test>=1200 && test<2800)
            System.out.println("ARC");
        else if(test>=2800)
            System.out.println("AGC");
    }
}