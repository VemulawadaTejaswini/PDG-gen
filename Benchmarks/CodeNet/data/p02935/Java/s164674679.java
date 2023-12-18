import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int v[] = new int[N];
        double temp;

        for (int i = 0;i < N; i++){
            v[i] = scanner.nextInt();
        }

        Arrays.sort(v);
        temp = v[0];
        
        for (int i = 1;i < N;i++){
            temp = (temp + v[i])/2;
        }

        System.out.println(temp);
    }
}