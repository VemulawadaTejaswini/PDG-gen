import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] s = new int[n];
        for(int i = 0; i < n; i++){
            s[i] = Integer.parseInt(sc.next());
        }
        int q = Integer.parseInt(sc.next());
        int c = 0;
        for(int i = 0; i < q; i++){
            int x = binarySearch(s, n, Integer.parseInt(sc.next()));
            if(x != -1) c++;
        }
        
        System.out.println(c);
    }
    
    static int binarySearch(int[] a, int n, int key){
        
        int left = 0;
        int right = n;
        
        while(left < right){
            int mid = (left + right) / 2;
            if(a[mid] == key){
                return mid;
            }else if(key < a[mid]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
