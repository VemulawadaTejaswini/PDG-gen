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
          long N=sc.nextInt();
          long M=sc.nextLong();
          ArrayList<Long>list=new ArrayList<>();
          for(long i=1 ; i<=M ; ++i){
		          if(M%i == 0){
			            list.add(i);
			            
		}
	        }
          long max=0;
          for(long i:list){
            if(i>max){
              long x=i*N;
              if(x<=M){
                max=i;
              }
            }
            
          }
          if(N==1){
            System.out.println(N);
          }else{
          System.out.println(max);}



          
    }






                



        }

