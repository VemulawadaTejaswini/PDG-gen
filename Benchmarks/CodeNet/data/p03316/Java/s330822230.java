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
        
        
        
        
        
        public static void main(String[]args){
                int x=0;
                for(int i=0;i<S.length();i++){
                        x+=Integer.parseInt(""+S.charAt(i));

                }
                int y=Integer.parseInt(S);
                if(y%x==0){
                        System.out.println("Yes");
                }else{
                        System.out.println("No");
                }

                
                

        }
        
        
        

		
	
}
