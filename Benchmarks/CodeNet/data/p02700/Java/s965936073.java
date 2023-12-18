

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d= sc.nextInt();
        int x = (b+c-1)/b;
        int y = (d+a-1)/d;
        if(x<=y){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}