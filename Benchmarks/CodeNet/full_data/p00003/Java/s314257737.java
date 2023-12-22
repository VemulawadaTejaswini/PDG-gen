import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
   int n, x, y, z;
   Scanner sc = new Scanner(System.in);
   n = sc.nextInt();
   for(int i = 1; i <= n; i++) {
   x = sc.nextInt();
   y = sc.nextInt();
   z = sc.nextInt();
   if(x*x==y*y+z*z)
   System.out.println("Yes");
   else if(y*y==z*z+x*x)
   System.out.println("Yes");
   else if(z*z==x*x+y*y)
   System.out.println("Yes");
   else
   System.out.println("No");
    }
}
}