import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner inputX = new Scanner(System.in);
        Scanner inputY = new Scanner(System.in);
        char inX = inputX.next().charAt(0);
        char inY = inputY.next().charAt(0);
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