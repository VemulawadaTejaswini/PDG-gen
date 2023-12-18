import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int a=0; 1<=a && a<=9; a++) {
            for(int b=0; 1<=b && b<=9; b++) {
                if(a*b == n) {
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}