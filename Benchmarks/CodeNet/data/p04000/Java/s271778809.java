import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(0);
        a.add(H-3);
        b.add(0);
        b.add(W-3);
        if(H>=4){
            a.add(1);
            a.add(H-4);
        }
        if(W>=4){
            b.add(1);
            b.add(W-4);
        }
        
        byte[][] Block = new byte[H][W];
        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            int y  = sc.nextInt();
            Block[x-1][y-1] = 1;
            if(x>=3&&x<=H-2){
                for(int j=x-3;j<=x-1;j++){
                    a.add(j);
                }
            }
            if(y>=3&&y<=W-2){
                for(int j=y-3;j<=y-1;j++){
                    b.add(j);
                }
            }
        }
        Set<Integer> set1 = new HashSet<>(a);
        Set<Integer> set2 = new HashSet<>(b);
        List<Integer> a2 = new ArrayList<>(set1);
        List<Integer> b2 = new ArrayList<>(set2);
        
        /*for(int i:a2){
            System.out.println(i);    
        }*/
        
        int[] J = new int[10];
        for(int i:a2){
            for(int j:b2){
                int sum = 0;
                for(int k=i;k<=i+2;k++){
                    for(int l=j;l<=j+2;l++){
                        sum += Block[k][l];    
                    }
                } 
                J[sum] += 1;
            }
        }
        for(int i=0;i<10;i++){
            System.out.println(J[i]);    
        }
        
    }
}
