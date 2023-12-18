package problemsolving;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

  class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        
        ArrayList<Character> a[] = new ArrayList [x1] ;
         for (int i = 0; i < x1; i++) { 
            a [i] = new ArrayList< >(); 
        } 
        for(int i = 0 ; i < x1 ; i++ ){
           for(int j = 0 ; j < x2 ; j++){
               
               a[i].add(scan .next() .charAt(0)) ;   
           } 
        } 
        
        for(int i = 0 ; i < x1 ; i++ ){
            int count = 0 , count2 = 0 ;
           for(int j = 0 ; j < x2 ; j++){
               if(a[i].get (j )  != '.' ){
                   count++;
               }
               if(a[j].size() != 0 && i< x2){
                if(a[j].get(i) != '.'   ){ 
                     count2++;
                  }
               }
           }
            
           if(count == 0){
               for(int j = x2-1 ; j >=0 ; j--){
                   a[i].remove(j);
               }
                
           }
           if(count2 == 0){
                
               for(int j = x2-1 ; j >=0 ; j--){
                   if(a[j].size()!=0 && i <x2 ){
                       a[j].remove(i);
                   }
               }
               x2-=1;  
               
           }
        }
        
        for(int i = 0 ; i < x1 ; i++ ){
            int count = 0 ;
            for(int j = 0 ; j < a[i].size() ; j++){
               if(a[i].size()!=0){
                   System.out.print (a[i].get(j) );
                   count ++;
               }
           } 
           if(count !=0){
               System.out.println();
           }
        }
    }
}