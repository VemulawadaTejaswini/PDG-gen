import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        for(int i = 1; i < n+1; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        int[] b = new int[n+1];
        
        countingSort(a, b, 10000);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < n+1; i++){
            sb.append(b[i]).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
    
    static void countingSort(int[] a, int[] b, int k){
        
        int[] c = new int[k+1];
        
        for(int j = 1; j < a.length; j++){
            c[a[j]]++;
        }
        
        for(int i = 1; i <= k; i++){
            c[i] = c[i] + c[i-1];
        }
        
        for(int j = a.length-1; j > 0; j--){
            b[c[a[j]]] = a[j];
            c[a[j]]--;
        }
    }
}
