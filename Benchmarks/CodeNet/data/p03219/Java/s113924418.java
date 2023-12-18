import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int train=scn.nextInt();
        int bus=scn.nextInt();
        System.out.println(train+bus/2);
    }
}