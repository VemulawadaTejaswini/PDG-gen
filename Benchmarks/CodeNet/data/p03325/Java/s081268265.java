import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0;i<n;i++){
            numbers[i] = sc.nextInt();
        }

        int answer = 0;

        for(int i = 0;i<n;i++){
            while(numbers[i] %2 == 0 && numbers[i] != 0){
                numbers[i] /= 2;
                answer++;
            }
        }
        System.out.println(answer);
    }
}