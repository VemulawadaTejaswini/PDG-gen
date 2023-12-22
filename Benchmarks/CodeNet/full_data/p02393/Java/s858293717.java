import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        Integer[] input = new Integer[3];
        input[0] = sc.nextInt();
        input[1] = sc.nextInt();
        input[2] = sc.nextInt();
        if((input[0] >= 1 && input[0] <= 10000) && (input[1] >= 1 && input[1] <= 10000) && (input[2] >= 1 && input[2] <= 10000)){
            if(input[1] < input[0]){
                int buffer = input[0];
                input[0] = input[1];
                input[1] = buffer;
            }
            if(input[2] < input[0]) {
                int buffer = input[0];
                input[0] = input[2];
                input[2] = buffer;
            }
            if(input[2] < input[1]){
                int buffer = input[1];
                input[1] = input[2];
                input[2] = buffer;
            }
            System.out.println("Output:");
            System.out.println(input[0] + " " + input[1] + " " + input[2]);
        }
        sc.close();
    }
}
