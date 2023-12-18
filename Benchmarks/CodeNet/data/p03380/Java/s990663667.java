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
                ArrayList<Integer> a = new ArrayList<Integer>();
                for(int i=0; i<N; i++)a.add(scan.nextInt());
                Collections.sort(a);
                double max = (double)a.get(N-1);
                double harfMax = max / 2;

                double r = max;
                for(int i=0; i<N-1; i++){
                        if(r > Math.abs((double)a.get(i) - harfMax)){
                                r = a.get(i);
                        }
                }
                System.out.print((int)max+" "+(int)r);
        }
}
