import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] Array = new int[N*2];
        for(int i = 0; i < N*2; i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            Array[i] = j;
            Array[i+1] = k;
        }

        for(int i = 0; i < N*2; i++){
            if(i==i+1 && i==i+2 && i==i+3 && i==i+4 && i==i+5){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

        sc.close();
    }
}