import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
        int[] number = new int[n];
        int a;

        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            number[a - 1] = i + 1;
        }

        for(int i = 0; i < n; i++){
            System.out.print(number[i] + " ");
        }

        System.out.println();

    }

}
