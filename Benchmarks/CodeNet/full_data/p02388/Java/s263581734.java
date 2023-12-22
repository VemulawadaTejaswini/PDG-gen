import java.util.Scanner;

class Main {
    int x;
    public void suzuki(){

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        System.out.println(x * x * x);
    }
    public static void main(String[] args) {

        new Main().suzuki();
    }

}