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
                int X=sc.nextInt();
                int[]x=new int[N];
                for(int i=0;i<N;i++){
                        x[i]=sc.nextInt();
                }
                int[]kyori=new int[N];
                for(int i=0;i<N;i++){
                        kyori[i]=Math.abs(X-x[i]);
                }
                if(N>1){
                int n=gcd(kyori[0],kyori[1]);
                for(int i=2;i<N;i++){
                        n=gcd(n,kyori[i]);

                }
                System.out.println(n);
        }else{
                System.out.println(Math.abs(X-x[0]));
        }




                


                
        }
        private static int gcd(int m, int n) {
                if(m < n) return gcd(n, m);
                if(n == 0) return m;
                return gcd(n, m % n);
            }
        
        
        

		
	
}
