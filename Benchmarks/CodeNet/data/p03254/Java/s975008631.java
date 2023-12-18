import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;



public class Main{

        static final Scanner sc=new Scanner(System.in);






        public static void main(String[]args){
                int N=sc.nextInt();
                int x=sc.nextInt();
                int[]a=new int[N];
                for(int i=0;i<N;i++){
                        a[i]=sc.nextInt();
                }
                Arrays.sort(a);
                int sum=0;
                for(int i=0;i<N;i++){
                        if(i==N-1){
                                if(x==a[i]){
                                        sum++;
                                }
                        }
                        else if(x>=a[i]){
                        x-=a[i];
                        sum++;
                }
                        else{
                                break;
                        }
                }
                System.out.println(sum);



                



        }








        
        private static int gcd(int m, int n) {
                if(m < n) return gcd(n, m);
                if(n == 0) return m;
                return gcd(n, m % n);
            }






}
