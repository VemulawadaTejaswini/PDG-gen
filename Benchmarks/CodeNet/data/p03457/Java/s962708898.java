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
                int N = sc.nextInt();
                ArrayList<Integer> t = new ArrayList<Integer>();
                ArrayList<Integer> x = new ArrayList<Integer>();
                ArrayList<Integer> y = new ArrayList<Integer>();
                t.add(0);
                x.add(0);
                y.add(0);

                for(int i=1; i<=N; i++){
                        t.add(sc.nextInt());
                        x.add(sc.nextInt());
                        y.add(sc.nextInt());
                }

                boolean ch = true,ch2 = true;

                for(int i=1; i<=N; i++){
                        ch = (t.get(i)-t.get(i-1))%2
                                ==  (Math.abs(x.get(i) - x.get(i-1))
                                        + Math.abs(y.get(i) - y.get(i-1)))%2;
                        ch2 = (t.get(i)-t.get(i-1)) - (Math.abs(x.get(i) - x.get(i-1))
                                        + Math.abs(y.get(i) - y.get(i-1)))  >= 0;
                        if(!(ch&&ch2))break;
                }

                if(ch&&ch2)System.out.print("Yes");
                if(!(ch&&ch2))System.out.print("No");
        }
}
