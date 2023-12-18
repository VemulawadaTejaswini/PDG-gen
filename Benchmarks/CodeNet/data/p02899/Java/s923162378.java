import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n; j++){
                if(a[j] == i){
                    sb.append(j+1).append(" ");
                }
            }
        }
        
        System.out.println(sb);
    }
}