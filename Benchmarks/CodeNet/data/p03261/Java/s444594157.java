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
                String[]moji=new String[N];
                boolean hantei=false;
                for(int i=0;i<N;i++){
                        moji[i]=sc.next();
                        String a=moji[i];
                        for(int j=0;j<i;j++){
                                if(a.equals(moji[j])){
                                        hantei=true;
                                }
                        }

                }
                if(hantei){
                        System.out.println("No");
                }else{
                        boolean hanteii=false;
                        for(int i=0;i<N-1;i++){
                                if(moji[i].charAt(moji[i].length()-1)==moji[i+1].charAt(0)){
                                        
                                }else{
                                        hanteii=true;
                                        
                                }
                        }
                        if(hanteii){
                                System.out.println("No");
                        }else{
                                System.out.println("Yes");
                        }
                }
                

                


                
        }
        
        
        

		
	
}
