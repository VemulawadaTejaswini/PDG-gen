import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        int BJ= A+B+C;
        if(BJ<=21){
            System.out.println("win");
        }
        else{
            System.out.println("bust");
        }
    }
}
