import java.util.Scanner;

public class Main {
    Main(){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        if(r<=x && r+x<W && r<=y && r+y<H){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    public static void main(String[] args){
        new Main();
    }
}

