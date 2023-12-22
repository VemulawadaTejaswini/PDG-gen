import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] S = new int[100000];
        int[] T = new int[50000];
        String[] in_S = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            S[i] = Integer.parseInt(in_S[i]);
        }
        int q = Integer.parseInt(br.readLine());
        String[] in_T = br.readLine().split(" ");
        int sum = 0;
        for(int i = 0; i < q; i++){
            T[i] = Integer.parseInt(in_T[i]);
            if( binarySearch(S, n, T[i])) sum++;
        }
        System.out.println(sum);
    }

    public static boolean binarySearch(int[] A, int n, int key){
        int left = 0;
        int right = n;
        int mid;
        while(left < right){
            mid = (left + right) / 2;
            if(A[mid] == key) return true;
            else if(A[mid] < key) left = mid + 1;
            else right = mid;
        }
        return false;
    }

}