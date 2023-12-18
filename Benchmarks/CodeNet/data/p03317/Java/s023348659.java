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
        static int N=sc.nextInt();
        static int K=sc.nextInt();
        static int[]A=new int[N];
        
        
        
        
        
        public static void main(String[]args){
                int ichi=0;
                for(int i=0;i<N;i++){
                        A[i]=sc.nextInt();
                        if(A[i]==1){
                                ichi=i;
                        }
                }
                int sum=0;
                int KK=K-1;
                if((N-1)%(K-1)==0){
                System.out.println((N-1)/(K-1));}
                else{
                        System.out.println((N-1)/(K-1)+1);
                }
                
                

        }
        
        
        

		
	
}
