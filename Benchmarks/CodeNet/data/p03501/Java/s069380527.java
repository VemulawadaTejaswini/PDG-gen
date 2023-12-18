


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveA();
    }

    private void solveA() {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = N * A;
        if (result <= B){
        	System.out.println(result);
        }else{
        	System.out.println(B);
        }

    }