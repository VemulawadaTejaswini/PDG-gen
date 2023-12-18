import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] a = new int[N];
        
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        
        
        int tmp = 0;
        int x = 0;
        int y = 0;
        for(int j = 0; j < a.length - 1; j++){
            if(j == 0){
                x = a[j];
            }else{
                x = y;
            }
            y = a[j + 1];
            while ((tmp = x % y) != 0) {
                x = y;
                y = tmp;
            }
        }
        
        System.out.println(y);
        
    }
}