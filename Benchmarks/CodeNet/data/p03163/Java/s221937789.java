import javax.print.DocFlavor;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] l = reader.readLine().split(" ");
        int q = Integer.parseInt(l[0]);
        int k = Integer.parseInt(l[1]);
        int[] weights = new int[q];
        int[] values = new int[q];
        for(int i =0;i<q;i++){
            String[] l1 = reader.readLine().split(" ");
            weights[i] = Integer.parseInt(l1[0]);
            values[i] = Integer.parseInt(l1[1]);
        }
        
        System.out.println(knapsack(0,k,weights,values));
    }
    public static int knapsack(int n,int k,int[] weights,int[] values){
        int res = 0;
        if(n==weights.length || k==0) {
            res= 0 ;
            return res;
        }
        else if(weights[n]>k){
            res = knapsack(n+1,k,weights,values);
            return res;
        }
        else return Math.max(values[n]+knapsack(n+1,k-weights[n],weights,values),knapsack(n+1,k,weights,values));
    }
}

