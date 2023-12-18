import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[N];
        int stock = 0;
        int count = 0;
        for(int i = 0; i < N-1; ++i){
            a[i] = sc.nextInt();
            if(x >= a[i]){
                stock = x -a[i];
                count += 1;
            }else{
                break;
            }
        }
        if(x == a[N-1]){
            count += 1;
        }
        System.out.println(count);
    }
}