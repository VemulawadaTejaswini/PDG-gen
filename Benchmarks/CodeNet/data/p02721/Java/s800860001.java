import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ips = br.readLine().split(" ");
        int n = Integer.parseInt(ips[0]);
        int k = Integer.parseInt(ips[1]);
        int c = Integer.parseInt(ips[2]);
        char[] str = br.readLine().toCharArray();
        Sol sol = new Sol(n, k, c, str);
        sol.sol();
    }
}

class Sol {
    int n,k,c;
    char[] arr;
    int[] chosen;
    LinkedList<Integer> res;
    
    Sol(int n, int k, int c, char[] arr){
        this.n = n;
        this.k = k;
        this.c = c;
        this.arr = arr;
        this.chosen = new int[n];
        res = new LinkedList<Integer>();
    }
    
    void sol(){
        int counter = 0;
        for(int i = 0; i < n && counter != k;++i){
            char curr = arr[i];
            if(curr != 'x'){
                counter++;
                chosen[i] = counter;
                i+=c;
            }
        }
        
        counter = k;
        for(int i = n-1; i >= 0 && counter != 0;--i){
            char curr = arr[i];
            if(curr != 'x'){
                chosen[i]-=counter;
                if(chosen[i] == 0){
                    res.addFirst(i);
                }
                i-=c;
                counter--;
            }
        }
        
        for(int el : res)
           System.out.println(el+1);
    }
}