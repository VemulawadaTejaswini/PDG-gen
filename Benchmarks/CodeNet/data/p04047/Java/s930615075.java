/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class JavaApplication69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0;
         Scanner in=new Scanner(System.in);
        int n=in.nextInt();
         int p=n*2;
        int []a=new int[p];
          for(int i=0;i<p;i++){
              a[i]=in.nextInt();
          }
        for(int i=0;i<p-1;i++){
            for(int j=1+i;j<p;j++){
                if(a[i]<a[j]){
                 int t =a[i];
                 a[i]=a[j];
                 a[j]=t;
                 
                }
              
            }
            
        }
        int s=0,m=1;
        
        for(int i=0;i<p-1;i++){
            for(int j=m;j<p;j++){
            if(a[i]>a[j]||a[i]==a[j]){
              x=a[j];
             s=s+x;
             m=m+2;
             break;
            }
            
        }
            
    }
    System.out.println(s  );
    }
}
    

