import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer d[] = new Integer[N];
        int s = 1;

        for(int i = 0;i < N;i++){
            d[i] = scanner.nextInt();
        }

        Arrays.sort(d, Comparator.reverseOrder());
        for(int i = 0;i < N - 1;i++){
            if(d[i] > d[i + 1])
            s++;
        }

        System.out.println(s);
        }
}