import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int win = -1;
        if(a == 1 || b == 1){
            if(a != 1){
                win = 1;
            }else if(a == b){
                win = 0;
            }
        }else if(a < b){
            win = 1;
        }else if(a == b){
            win = 0;
        }
        switch(win){
            case -1:
                System.out.print("Alice");
            break;
            case 0:
                System.out.print("Draw");
            break;
            case 1:
                System.out.print("Bob");
            break;
        }
    }
}