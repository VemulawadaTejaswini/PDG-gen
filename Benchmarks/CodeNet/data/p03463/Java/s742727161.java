import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A =scan.nextInt();
        int B = scan.nextInt();

        if(Math.abs(A-B)%2 == 1){
            System.out.println("Borys");
        }else{
            System.out.println("Alice");
        }
    }
}