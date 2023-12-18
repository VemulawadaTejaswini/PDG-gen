import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Main{
        public static void main(String args[]){
                Scanner = sc = new Scanner(System.in);
                int X = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = (X - A) % B ;
                System.out.print(C);
        }
}
