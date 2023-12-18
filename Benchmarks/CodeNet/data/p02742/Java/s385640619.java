import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();

        if (H%2 == 0) {
            System.out.println(H/2 * W);
        // } else if (W%2 == 0) {
        //     System.out.println((H/2 + 1) * W - W/2);
        } 
        else {
            System.out.println((H/2 + 1) * W - W/2);
        }
    }
}