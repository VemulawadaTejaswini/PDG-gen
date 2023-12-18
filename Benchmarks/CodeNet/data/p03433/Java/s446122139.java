import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                int N = scan.nextInt();
                int A = scan.nextInt();
                int B = N % 500;
                if(B<=A)System.out.println("Yes");
                if(B>A)System.out.println("No");
        }
}
