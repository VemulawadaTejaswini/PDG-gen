import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] input = new int[num];

        for(int i = 0; i < num; i++)
            input[i] = sc.nextInt();

        System.out.print(input[0]);
        for(int i = 1; i < num; i++)
            System.out.print(" " + input[num - i]);
        System.out.println("");
        sc.close();
    }
}

