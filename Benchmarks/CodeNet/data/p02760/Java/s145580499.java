/*
 *  author : Atul Anand   
 *  created on : Tue Mar 31 2020
 */

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        int A[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                A[i][j] = in.nextInt();
            }
        }

        int N = in.nextInt();
        for(int i = 0; i < N; i++){
            int b = in.nextInt();
            for(int x = 0; x < 3; x++){
                for(int y = 0; y < 3; y++){
                    if(A[x][y] == b){
                        A[x][y] = 0;
                        break;
                    }
                }
            }
        }
        
        if(checkRow(A) || checkColumn(A) || checkDiagonal(A)){
            println("Yes");
        }
        else{
            println("No");
        }

        in.close();
        out.close();
    }

    public static boolean checkRow(int A[][]){
        for(int i = 0; i < 3; i++){
            boolean flag = true;
            for(int j = 0; j < 3; j++){
                if(A[i][j] != 0){
                    flag = false;
                }
            }
            if(flag){
                return true;
            }
        }

        return false;
    }

    public static boolean checkColumn(int A[][]){
        for(int j = 0; j < 3; j++){
            boolean flag = true;
            for(int i = 0; i < 3; i++){
                if(A[i][j] != 0){
                    flag = false;
                }
            }
            if(flag){
                return true;
            }
        }

        return false;
    }

    public static boolean checkDiagonal(int A[][]){
        // left diagonal
        if(A[0][0] == 0 && A[1][1] == 0 && A[2][2] == 0){
            return true;
        }
        // right diagonal
        if(A[0][2] == 0 && A[1][1] == 0 && A[2][0] == 0){
            return true;
        }

        return false;
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);

    static void read(int arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextInt(); 
    	} 
    }
    
    static void read(long arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextLong(); 
    	} 
    }
    
    static void read(String arr[], int N) throws IOException { 
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.next(); 
    	} 
    }
    
    static void print(Object O) {  
    	out.print(O); 
    }
    
    static void println(Object O) { 
    	out.println(O); 
    }
    
    static void println(int arr[]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		print(arr[i]+" "); 
    	} 
    	println(""); 
    }

    static void println(int arr[][]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		println(arr[i]); 
    	}
    }
    
    static void debug(Object O) { 
    	System.out.println(O); 
    }
}

class Reader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    Reader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    String next() throws IOException {
        while (!tokenizer.hasMoreTokens() ) { 
            tokenizer = new StringTokenizer(reader.readLine()); 
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException { 
        return Integer.parseInt(next()); 
    }
    
    double nextDouble() throws IOException { 
        return Double.parseDouble(next());
    }
    
    long nextLong() throws IOException { 
        return Long.parseLong(next()); 
    }
    
    String nextLine() throws IOException { 
        return reader.readLine(); 
    }
    
    void close() throws IOException { 
        reader.close(); 
    }
}