import java.util.*;
public class Thing{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, answer;
        
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        System.out.print("\nEnter another number: ");
        b = sc.nextInt();
        

        if(a>=10||b>=10)
            answer = -1;
        else
            answer = a*b;
        
        System.out.println("The product is "+answer);
    }
}