

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x,a,b;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println((x-a)%b);
    }
}