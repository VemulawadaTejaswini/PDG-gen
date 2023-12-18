import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] numbers=new int[N];
        for(int i=0; i<N; i++) {
            numbers[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(totalMoves(numbers));
    }

    private static String totalMoves(int x[]) {
        int biggest = 0;
        int sum = 0;
        for(int i = 0; i < x.length; i++) {
            if(x[i] > biggest) {
                biggest = x[i];
            }
            sum = sum + x[i];
        }

        sum = sum - biggest;
        if(sum > biggest) {
            return "Yes";
        }

        return "No";
    }

}


