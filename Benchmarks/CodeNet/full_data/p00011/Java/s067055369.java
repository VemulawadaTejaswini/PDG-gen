import java.util.*;
import java.io.*;
 
class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        
            int w = sc.nextInt();
            int[] amida = new int[w+1];
            amida[0]=0;
            for(int i=0; i<=w; i++){
                amida[i] = i; 
            }
            int a,b;
            int temp;
            int n = sc.nextInt();
            for(int i=0; i<n; i++){
                String[] values = sc.nextLine().split(",");
                a = Integer.parseInt(values[0]);
                b = Integer.parseInt(values[1]);
                 
                temp = amida[a];
                amida[a] = amida[b];
                amida[b] = temp;
            }
             
            for(int i=1; i<=w; i++){
                System.out.println(amida[i]);
            }
             
         
         
    }
}