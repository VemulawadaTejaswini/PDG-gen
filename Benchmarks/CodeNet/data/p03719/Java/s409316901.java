import java.util.Scanner;

class ABC {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
       System.out.print("整数a:");  int a = stdIn.nextInt();
       System.out.print("整数b:");  int b = stdIn.nextInt();
       System.out.print("整数c:");  int c = stdIn.nextInt();
       
       if (a <= c && b >= c)
           System.out.println("Yes");
       else
           System.out.println("No");
    }
    
}