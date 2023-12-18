import java.util.*;
import java.io.*;
 
public class Main{
    static PrintWriter out = new PrintWriter(System.out);
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] X = new int[N];
        double average = 0;
        for(int i = 0; i < N; i++){
            X[i] = Integer.parseInt(sc.next());
            average = average + X[i];
        }
        average = Math.round(average/N);
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum = sum + (X[i]-(int)average)*(X[i]-(int)average);
        }

        System.out.println(sum);
       
    }
} 