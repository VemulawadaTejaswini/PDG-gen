
import java.util.Scanner;

public class Hanafuda {
        public static void main(String[] args){

                Scanner sn = new Scanner(System.in);
                int n, r;

                while( (n = sn.nextInt())!=0 && (r = sn.nextInt()) != 0 ){
                        int[] array = rangeArray(n);
                        for(int i = 0; i < r; i++){
                                shuffle(array, sn.nextInt(), sn.nextInt());
                        }
                        System.out.println(topOf(array));
                }

        }

        static void shuffle(int[] a, int _p, int  c){
        		int p =_p-1;
                int[] p2c = new int[c];
                for(int i = 0; i < c; i++) p2c[i] = a[p+i];
                for(int i = 0; p != i; i++) a[(p+c-1)-i] = a[(p-1)-i];
                for(int i = 0; i < c; i++) a[i] = p2c[i];
        }

        static void printArray(int[] a){
                for(int i = 0; i < a.length; i++) System.out.print(a[i]+" ");
                System.out.println();
        }

        static int[] rangeArray(int n){
                int[] a = new int[n];
                for(int i = 0; i < a.length; i++) a[i] = n-i;
                return a;
        }
        
        static int topOf(int[] a){ return a[0];}
}