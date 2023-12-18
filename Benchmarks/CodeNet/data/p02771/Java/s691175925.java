import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b){
            if(a != c){
                System.out.println("Yes");
                return;
            } else {
                System.out.println("No");
                return;
            }
        } else {
            if(a == c){
                System.out.println("Yes");
                return;
            } else {
                System.out.println("No");
                return;
            }
        }
    }
}