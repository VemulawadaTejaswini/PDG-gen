import java.util.*;
import java.Math.*;
 
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int keta = (int)Math.log10(b)+1;
    int c = a*(int)Math.pow(10,keta);
    int d = c+b;
    int k = 0;
    for(int i = 2;i<Math.sqrt(d);i++) {
      if(d/(int)Math.pow(i,2) == 1) {
        System.out.println("Yes");
        k +=1;
               }
                           }
                           if(k==0) System.out.println("No");
                           }
                           }