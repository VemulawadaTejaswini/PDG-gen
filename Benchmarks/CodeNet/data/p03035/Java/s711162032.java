import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A >= 13){
            System.out.println(B);
            return;
        } else if(A >= 6 && A <= 12) {
            System.out.println(B/2);
            return;
        } else {
            System.out.println(0);
            return;
        }
    }
}