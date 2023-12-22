import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public long[] result;     
    class edge {
        public int a;  
        public int b;  
        public int value;  
        
        edge(int a, int b, int value) {
            this.a = a;
            this.b = b;
            this.value = value;
        }
    }
 
    public boolean getShortestPaths(int n, int s, edge[] A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        result = new long[n];
        boolean[] used = new boolean[n];
        int[] num = new int[n];
        for(int i = 0;i < n;i++) {
            result[i] = Integer.MAX_VALUE;
            used[i] = false;
        }
        result[s] = 0;    
        used[s] = true;   
        num[s] = 1;       
        list.add(s);      
        while(list.size() != 0) {
            int a = list.get(0);  
            list.remove(0);         
            for(int i = 0;i < A.length;i++) {
           
                if(a == A[i].a && result[A[i].b] > result[A[i].a] + A[i].value) { 
                    result[A[i].b] = result[A[i].a] + A[i].value;
                    if(!used[A[i].b]) {
                        list.add(A[i].b);
                        num[A[i].b]++;
                        if(num[A[i].b] > n)
                            return false;
                        used[A[i].b] = true;   
                    }
                }
            }
            used[a] = false;     
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException {
    	Main test = new Main();
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String str = BR.readLine();
		String [] arr = str.split("\\s+");
        int n = Integer.parseInt(arr[0]);;
        int s = Integer.parseInt(arr[2]);;
        int p = Integer.parseInt(arr[1]);;        
        edge[] A = new edge[p];
        for(int i = 0;i < p;i++) {
        	String tempstr = BR.readLine();
			String [] temparr = tempstr.split("\\s+");
			int p1 = Integer.parseInt(temparr[0]);
			int p2 = Integer.parseInt(temparr[1]);
			int w = Integer.parseInt(temparr[2]);
             A[i] = test.new edge(p1, p2, w);
        }
        if(test.getShortestPaths(n, s, A)) {
             for(int i = 0;i < test.result.length;i++){
            	 if(test.result[i]==Integer.MAX_VALUE){
            		 System.out.println("INF");
            	 }else{
            		 System.out.println(test.result[i]);
            	 } 
             }
                 
        } else
             System.out.println("null");
    }
}