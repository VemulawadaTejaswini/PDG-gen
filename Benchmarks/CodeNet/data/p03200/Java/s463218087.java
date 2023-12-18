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
          String S=sc.next();
          int sumb=0;
          int sumbb=0;
          int sum=0;
          for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='W'){
              sumb++;
            }
          }
          for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='B'){
              sum+=sumb-sumbb;
            }else{
              sumbb++;
            }
          }
          System.out.println(sum);


                



        }}








        
        