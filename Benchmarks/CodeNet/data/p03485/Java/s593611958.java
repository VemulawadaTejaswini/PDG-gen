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
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                double x;
                int re;
                x = ( (a+b/2)+0.5 );
                re = (int)x;
                System.out.print(re);
        }
}
