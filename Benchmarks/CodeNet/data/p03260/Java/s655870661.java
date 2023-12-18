import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if ((sc.nextInt() * sc.nextInt()) % 2 == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}