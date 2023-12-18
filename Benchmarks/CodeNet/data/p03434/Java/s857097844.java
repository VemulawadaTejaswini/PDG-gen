import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] number = new int[n];
        for(int i = 0;i<n;i++){
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        int[] number2 = new int[n];
        for(int i = 0;i<n;i++){
            number2[i] = number[n-i-1];
        }
        int a = 0;
        int b = 0;
        for(int i = 0;i<n;i++){
            if(i%2 == 0){
                a += number2[i];
            }
            if(i%2 == 1){
                b += number2[i];
            }
        }
        System.out.println(a-b);
    }
}