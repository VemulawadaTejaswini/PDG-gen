import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int count =0;
        if(a!=b && b!=c)
            count = 3;
        else if(a==b || b==c)
            count = 2;
        else
            count=0;
        System.out.println(count);
    }
}
