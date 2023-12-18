import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner( System.in );
    public static void Main(String args[]) {
        System.out.print( "Type a and b: " );
        String abString = scanner.nextLine();
        String [] mylist = abString.split(" ");
        int a = Integer.parseInt(mylist[0]);
        int b = Integer.parseInt(mylist[1]);
        int  product = a*b;
        if(product % 2 == 0){System.out.println("Even");}
        else{System.out.println("Odd");}
       
        
    }
}