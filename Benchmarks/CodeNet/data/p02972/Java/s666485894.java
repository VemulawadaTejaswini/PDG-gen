import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a[] = new int[N];

        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }

        int b[] = new int[N];
        int count = 0;

        for(int i = N - 1; i >= 0; i--){
            int sum = 0;
            for(int j = i; j < N; j += (i + 1)){
                sum += a[j];
            }
            if(sum % 2 == 1){
                b[count] = i + 1;
                count++;
            }
        }

        System.out.println(count);
        for(int i = 0; i < count; i++){
            System.out.print(b[i] + " ");
        }

        sc.close();
    }
}
