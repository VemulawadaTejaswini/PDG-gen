import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 2 || y == 2) {
            System.out.println("No");
        } else {
            if (inGroup(x) && inGroup(y)){
                System.out.println("Yes");
            } else if (!inGroup(x) && !inGroup(y)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean inGroup(int x){
        switch(x){
            case 4:
            case 6:
            case 9:
            case 11:
                return true;
            default:
                return false;
        }
    }
}