import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        int sum = 0;
        for (int i=0; i<n; i++) sum += arr[i];

        if (h<=sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}




