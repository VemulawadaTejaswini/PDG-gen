import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        int a=input.nextInt();
        input.nextLine();
        String s=input.nextLine();


        if(a>=3200)
            System.out.println(s);

        else System.out.println("red");

    }
}
