import java.util.Scanner;
import java.util.*; 

class Main {
    private static int a,b;
    public static void main(String[] args){
    
     Scanner s = new Scanner(System.in);
    a=s.nextInt();
    int[] array= new int[a] ;
   for(int i=0;i<a;i++){
       b=s.nextInt();
       array[i]=b;
       
   }
   for(int x=array.length-1;x<=1;x--){
       System.out.println(array[x]+" ");
   }
   
       
   }
}

