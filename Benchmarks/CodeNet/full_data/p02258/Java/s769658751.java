




import java.util.*;
 
public class  Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int a[] = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
    
        int max = Integer.MIN_VALUE;
        int min = a[0];
        for(int i = 1; i < N; i++){
            max = Math.max(max, a[i] - min);
            min = Math.min(min, a[i]);

        }
        System.out.println(max); 



    }   
}





