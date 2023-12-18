import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String inStr = input.nextLine();
        char inX = inStr.charAt(0);
        char inY = inStr.charAt(2);
        System.out.println(inX);
        System.out.println(inY);
        if(inX < inY){
            System.out.println("<");
        }
        else if(inX > inY){
            System.out.println(">");
        }
        else{
            System.out.println("=");
        }
    }
}