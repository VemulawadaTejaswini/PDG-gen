import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int a[] = new int[N+1];
        a[0] = 0;
        for(int i = 1; i < a.length; i++){
            a[i] = sc.nextInt();
            if(i%2 == 1 && a[i]%2 == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
