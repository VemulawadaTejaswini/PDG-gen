 
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int arr[];
        double ans[];
        while( sc.hasNext() ){
            arr = new int[3];
             
            String line[] = sc.nextLine().split(" ");
            arr[0] = Integer.parseInt(line[0]);
            arr[1] = Integer.parseInt(line[1]);
            arr[2] = Integer.parseInt(line[2]);
             
            Arrays.sort(arr);
             
            if (arr[0]*arr[0] + arr[1]*arr[1] == arr[3]*arr[3]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}