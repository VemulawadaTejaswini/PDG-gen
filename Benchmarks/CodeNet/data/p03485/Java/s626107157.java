import java.util.*;
public class Main{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ave;
        if(a + b % 2 == 0){ave = a+b/2;}
        else{ave = (a+b/2) + 1;}
      
        System.out.println(ave);
    }
}