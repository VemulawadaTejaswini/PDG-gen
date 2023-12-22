import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] a = new int [N];
        int count = 0;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            
            if(i%2 == 1 && a[i]%2 == 1){
                count++;
            }
        }
        
        System.out.println(count);
    }
}