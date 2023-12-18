import java.util.*;
 
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] m = new int[n];
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
            if(min > a[i]){
                min = a[i];
                minIndex = i+n;
            }
        }
        for(int i = 0; i <= min*2; i+=2){
            m = new int[n];
            m[(minIndex)%n] = i;
            for(int j = 1; j < n; j++){
                m[(j+minIndex)%n] = (a[(j+minIndex-1)%n] - m[(j+minIndex-1)%n]/2)*2;
            }
            if((m[(minIndex)%n] + m[(minIndex-1)%n])/2 == a[(minIndex-1)%n]){
                
                break;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(m[i]);
        }
    }
}