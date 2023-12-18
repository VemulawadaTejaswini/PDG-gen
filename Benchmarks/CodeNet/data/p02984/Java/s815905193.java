import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] rain = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
            if(i % 2 == 0){
                rain[0] += a[i];
            }else{
                rain[0] -= a[i];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(rain[0]).append(" ");
        for(int i = 1; i < n; i++){
            rain[i] = a[i-1] * 2 - rain[i-1];
            sb.append(rain[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}