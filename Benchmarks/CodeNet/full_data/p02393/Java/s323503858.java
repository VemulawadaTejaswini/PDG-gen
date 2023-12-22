import java.util.Scanner;                                                   
import java.util.*;
 
class Main{
     public static void main(String[] args){
             Scanner in = new Scanner(System.in);
             int a = in.nextInt();
             int b = in.nextInt();
             int c = in.nextInt();
             int [] arr = {a,b,c};
             Arrays.sort(arr);
             System.out.println(arr[0] + "arr[1]" + arr[2]);
         }
}