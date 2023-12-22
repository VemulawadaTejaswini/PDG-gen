import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int menseki, shu;
        Scanner scan = new Scanner(System.in);
        int tate = scan.nextInt();
        int yoko = scan.nextInt();
        menseki = tate * yoko;
        shu = tate * 2 + yoko * 2;
        System.out.println(menseki + " " + shu);
    }
}

