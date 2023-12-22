import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       String a = scanner.next();
       String b = scanner.next();
       int i = 0;
       char[] a1 = a.toCharArray();
       char[] b1 = b.toCharArray();

       for (i = 0;i<a1.length;i++){
           if (a1[i]!=b1[i]){
               System.out.println("No");
               break;
           }
       }
       if (i == a1.length){
           System.out.println("Yes");
       }

    }
}
