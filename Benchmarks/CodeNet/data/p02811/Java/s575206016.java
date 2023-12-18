import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int K=input.nextInt();
        int X=input.nextInt();
        if (500*K>=X){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}