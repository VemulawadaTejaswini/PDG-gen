import java.util.Scanner;
import java.util.Arrays; 

class Main {
    private static int a;
    public static void main(String[] args){
    
     Scanner s = new Scanner(System.in);
    a=s.nextInt();
    int[] array= new int[a] ;
   for(int i=0;i<a;i++){
       int b=s.nextInt();
       array[i]=b;
       
   }
   for(int x=a-1;x>=0;x++){
       System.out.println(array[x]);
   }
   
       
   }
}

