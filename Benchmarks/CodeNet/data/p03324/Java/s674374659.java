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
        static int D=sc.nextInt();
        static int N=sc.nextInt();
        
        public static void main(String[]args){
                if(N!=100){
                int x=(int)Math.pow(100,D);
                x=x*N;
                System.out.println(x);}else{
                        if(D==0){
                                System.out.println(101);
                        }else if(D==1){
                                System.out.println(10100);
                        }else if(D==2){
                                System.out.println(1010000);
                        }
                }

                

        }
        
        
        

		
	
}
