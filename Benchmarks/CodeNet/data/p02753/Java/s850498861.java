import java.util.Scanner;
public class Amon01{
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);

        char one = scan.next();
        char two = scan.next();
        char three = scan.next();

        if(one==two) 
           if(two==three) System.out.printf("No");
           else System.out.printf("Yes");
        else System.out.printf("Yes");
           

    }
}