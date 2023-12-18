import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long h = scan.nextLong();
        long w = scan.nextLong();
        if (h == 1 && w == 1) {
            System.out.println(1);
        } else {
            if(h%2 == 0 && w%2 == 0){
                System.out.println((h * w) / 2);
            }else{
                System.out.println((h * w) / 2 + 1);
            }
        }

    }
}