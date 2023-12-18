

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long blue = sc.nextLong();
        long red  = sc.nextLong();
        long total = 0;
        if (blue != 0){
            total = n - red;
        }
        System.out.println(total);
    }
}