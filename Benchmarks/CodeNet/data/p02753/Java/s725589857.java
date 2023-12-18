import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);

        String one = scan.next();
        String two = scan.next();
        String three = scan.next();

        if(one.equals(two)) 
           if(two.equals(three)) System.out.printf("No");
           else System.out.printf("Yes");
        else System.out.printf("Yes");
           

    }
}