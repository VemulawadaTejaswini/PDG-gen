import java.util.*;
import java.io.*;

public class Main {
    public static void printTable(int[][] table){
        int N = table.length;
        for(int r=0;r<N;r++){
        	for(int l=0;l<N;l++)System.out.print(table[l][r]+" ");
        	System.out.println();
        }
    }
    public static int[][] makeTable(int N, int[] Left, int[]Right){
        int[][] count = new int[N][N];
        
        for(int m=0;m<Left.length;m++){
        	count[Left[m]][Right[m]]++;
        }
        
        for(int l=N-1;l>0;l--){
        	for(int r=0;r<N;r++)count[l-1][r]+=count[l][r];
        }
        for(int r=0;r<N-1;r++){
        	for(int l=0;l<N;l++)count[l][r+1]+=count[l][r];
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] Left = new int[M];
        int[] Right = new int[M];
        for(int m=0;m<M;m++){
        	Left[m]=sc.nextInt()-1;
        	Right[m]=sc.nextInt()-1;
        }
        int[][] table = makeTable(N,Left,Right);
        
        for(int query=0;query<Q;query++){
        	int p = sc.nextInt()-1;
        	int q = sc.nextInt()-1;
        	System.out.println(table[p][q]);
        }
    }
}