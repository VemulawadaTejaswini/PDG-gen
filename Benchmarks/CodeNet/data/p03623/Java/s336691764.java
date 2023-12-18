import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(Math.abs(n-a)>Math.abs(n-b)){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }
        }
    }

