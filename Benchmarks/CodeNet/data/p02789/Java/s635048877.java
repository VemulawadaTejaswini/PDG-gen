import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();

        if(n == m) System.out.println("Yes");
        else System.out.println("No");
    } 
}