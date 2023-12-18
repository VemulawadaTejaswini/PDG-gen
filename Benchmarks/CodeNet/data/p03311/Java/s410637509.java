import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] tokens = br.readLine().split(" ");
        for(int i = 0; i < n; ++i)
            arr[i] = Integer.parseInt(tokens[i]) - (i+1);
        Arrays.sort(arr);
        if(n%2==1)
            System.out.println(got(arr, arr[n/2]));
        else {
            int res = (int)((long)arr[n/2] + arr[n+1/2])/2;
            System.out.println(got(arr, res));
        }
    }
    private static long got(int[] arr, int b){
        long res = 0;
        for(int i = 0, n = arr.length; i < n; ++i)
            res += Math.abs(arr[i] - b);
        return res;
    }
}