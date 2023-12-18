import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int a = scan.nextInt();
        final String s = scan.next();

        if(a >= 3200){
            System.out.println(s);
        }
        else{
            System.out.println("red");
        }
        scan.close();
    }
  
}