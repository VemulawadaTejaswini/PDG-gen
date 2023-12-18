import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int k = input.nextInt();
        int x = input.nextInt();
        k = k*500;
        if(k>=x) System.out.println("Yes");
        else System.out.println("No");
    }
}