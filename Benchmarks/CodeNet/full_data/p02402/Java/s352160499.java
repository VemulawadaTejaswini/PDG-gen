import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int inputNum = sc.nextInt();
        int min = inputNum, max = inputNum;
        long sum = inputNum;

        for(int i = 0; i < n - 1; i++){
            inputNum = sc.nextInt();
            if(inputNum < min)
                min = inputNum;
            if(inputNum > max)
                max = inputNum;
            sum += (long)inputNum;
        }
        System.out.println(min + " " + max + " " + sum);
    }
}

