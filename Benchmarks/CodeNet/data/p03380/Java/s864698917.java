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
                int N;
                N = scan.nextInt();
                ArrayList<Integer> a = new ArrayList<Integer>();
                for(int i=0; i<N; i++)a.add(scan.nextInt());

                Collections.sort(a);
                //check(a);
                double max = (double)a.get(N-1);
                //System.out.println("max = "+max);
                double harfMax = max / 2;
                //System.out.println("harfMax = "+harfMax);

                double r_ = max,r = a.get(0);
                for(int i=0; i<N-1; i++){
                        if(r_ > Math.abs((double)a.get(i) - harfMax)){
                                r_ = Math.abs((double)a.get(i) - harfMax);
                                r = a.get(i);
                        }
                }
                System.out.print((int)max+" "+(int)r);
        }

        public static void check(ArrayList<Integer> a){
                System.out.print("sorting ->");
                for(int i=0; i<a.size(); i++)System.out.print(a.get(i)+" ");
                System.out.print(" ");
        }
}
