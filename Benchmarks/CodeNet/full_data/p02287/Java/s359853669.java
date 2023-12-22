import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] T = new int[n + 1];

        for(int i = 1; i <= n; i ++){
            T[i] = sc.nextInt();
        }

        for(int i = 1; i <= n ; i ++){
            System.out.print("node " + i + ": key = " + T[i] + ", ");
            if(i/2 > 0){
                System.out.print(" parent key = " + T[i/2] + ", ");
            }

            if(2*i <= n){
                System.out.print(" left key = " + T[2*i] + ", ");
            }

            if((2*i + 1) <= n){
                System.out.print(" right key = " + T[2*i + 1] + ", ");
            }
            System.out.println();
        }

    }


}

