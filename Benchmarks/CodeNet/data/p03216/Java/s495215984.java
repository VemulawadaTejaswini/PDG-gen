
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

   int len = cin.nextInt();
   String in = cin.next();
   int q = cin.nextInt();
   int[] req = new int[q];
   int[] res = new int[q];
   for (int i=0;i<q;i++) {
     req[i] = cin.nextInt();
   }

   for (int a = 0;a<len;a++) {
     if (in.charAt(a)=='D') {
       for (int b = a+1;b<len;b++) {
         if (in.charAt(b)=='M') {
           for (int c = b+1;c<len;c++) {
              if (in.charAt(c)=='C') {
//                System.out.println("D at "+a+" M at "+b+" C at "+c);
                for (int i=0;i<q;i++) {
                  if (c-a<req[i]) res[i]++;
                }
              }
           }
         }

       }
     }

   }

   for (int i=0;i<q;i++) {
     System.out.println(res[i]);
   }

  }

}
