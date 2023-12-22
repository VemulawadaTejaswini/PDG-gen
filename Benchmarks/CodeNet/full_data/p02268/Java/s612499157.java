import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n];
        for(int i = 0; i < n; i++){
            S[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] T = new int[q];
        for(int i = 0; i < q; i++){
            T[i] = sc.nextInt();
        }
        int count = 0;
        
        
        for(int i = 0; i < q; i++){
            if(BinarySearch(S, T[i])){
                count++;
            }
        }
        System.out.println(count);
   }
   
   public static boolean BinarySearch(int[] S, int key){
       int left = 0;
       int right = S.length - 1;
       int mid = 0;
       
       while(left <= right){
           //System.out.println(left + " " + right + " " + mid);
           mid = (left + right)/2;
           if(S[mid] == key){
               // System.out.println(key + " " + mid);
                return true;
           }else if (key < S[mid]){
                right = mid-1;
           }else{
                left = mid+1;
           }
       }
       return false;
   }
}
