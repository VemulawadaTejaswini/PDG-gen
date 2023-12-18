import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double x =(a+b)/2;
        int y =(int)x;
        if((x-y)>0)
           System.out.println(y+1);
        else
           System.out.println(y);

		
    }
}

