import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long count = 0;
        while (x < y){
            x = x*2;
            count++;
        }
        System.out.println(count);
    }
}
