import java.io.*;
import java.util.*;
public class Main{
    public static void main(String []args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(br.readLine());
        // long [][] dp = new long[n+1][n+1];
        // ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        int q = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < q ; i++){
            HashSet<Integer> set = new HashSet<>();
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int j = l-1 ; j < n && j <r ; j++){
                set.add(arr[j]);
            }
            System.out.println(set.size());
        }
        
    }
}