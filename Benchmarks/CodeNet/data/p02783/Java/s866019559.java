import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int a = scan.nextInt();
        scan.close();

        int count = 0;

        while(true){
            count++;
            if(h <= a) break;
            h = h - a;
        }

        System.out.println(count);
    }
}