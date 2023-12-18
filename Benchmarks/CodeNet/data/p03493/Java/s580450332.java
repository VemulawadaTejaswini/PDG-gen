


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveC();
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

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[];
        arr = str.split(" ");

        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveC() {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
  		int s3 = sc.nextInt();
  		int cnt=0;
  		if(s1 == 1){
  			cnt++;
  		}
  		if(s2 == 1){
  			cnt++;
  		}
  		if(s3 == 1){
  			cnt++;
  		}

        System.out.println(cnt);
    }

    private void solveD() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveE() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveF() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

}