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
                int T=sc.nextInt();
                for(int i=0;i<T;i++){
                        long A=sc.nextLong();
                        long B=sc.nextLong();
                        long C=sc.nextLong();
                        long D=sc.nextLong();
                        ArrayList<Long>kazoe=new ArrayList<>();
                        if(A<B){
                                System.out.println("No");
                        }else{
                                
                                        
                                
                                
                                for(;;){if(kazoe.size()>5000){
                                        System.out.println("Yes");                                }
                                        
                                        long X=A/B-1;
                                        if(X>0){
                                                A=A-B*X;

                                        }
                                        if(A<B){
                                                System.out.println("No");
                                                break;
                                        }else{
                                        if(A-B<=C){
                                                A=A-B+D;
                                                if(kazoe.contains(A)){
                                                        System.out.println("Yes");
                                                        break;
                                                }
                                                kazoe.add(A);
                                               
                                                
                                        }
                                        else{
                                                A=A-B;
                                                if(kazoe.contains(A)){
                                                        System.out.println("Yes");
                                                        break;
                                                }
                                                kazoe.add(A);

                                        }
                                       
                                }

                                }
                        }
                }
                
                


                
        }
        
        
        

		
	
}
