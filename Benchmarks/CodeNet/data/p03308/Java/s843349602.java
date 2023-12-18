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
                int[]A=new int[N];
                for(int i=0;i<N;i++){
                        A[i]=sc.nextInt();
                }
                int max=0;
                Arrays.sort(A);
                max=Math.abs(A[0]-A[N-1]);
                System.out.println(max);

        }
        
        
        

		
	
}
