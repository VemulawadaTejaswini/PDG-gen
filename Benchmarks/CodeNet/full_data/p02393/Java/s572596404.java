import java.util.Scanner;                                                   
import java.util.*;
 
class C2{
     public static void main(String[] args){
             Scanner in = new Scanner(System.in);
             int a = in.nextInt();
             int b = in.nextInt();
             int c = in.nextInt();
             int [] arr = {a,b,c};
             Arrays.sort(arr);
             for(int i = 0; i < arr.length; i++)
             System.out.println(arr[i]);
         }
}