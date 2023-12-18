import java.util.Scanner;

public class EvenA {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,num;
        a=scanner.nextInt();
        b=scanner.nextInt();
        num=a*b;
        if(num%2==0){
            System.out.println("Even" );
        }
        else{
            System.out.println("Odd" );
        }
    }
}
