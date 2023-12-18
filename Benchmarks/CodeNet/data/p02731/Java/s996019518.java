import java.util.Scanner;
public class Main { 
    public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();
    int l= s/3;
    s -= l ;
    int b = s/2;
    int h = s -b ;
    
    System.out.println(l * b * h);
    
 
   }
} 