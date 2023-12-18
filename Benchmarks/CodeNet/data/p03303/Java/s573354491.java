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
        static String S=sc.next();
        static int w=sc.nextInt();
        
        
        
        
        
        public static void main(String[]args){
                boolean ok=true;
                int o=0;
                while(ok){
                        if(o>S.length()-1){
                                System.out.println();
                                break;
                        }
                        System.out.print(S.charAt(o));
                        o=o+w;



                }
                
                

        }
        
        
        

		
	
}
