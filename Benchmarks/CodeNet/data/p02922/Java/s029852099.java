
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b = in.nextInt();
        int count=1;
        int socks=a;
        if(b==1){
            System.out.println(0);
        }
        else {

            if(b>1 && b<a)
                System.out.println(1);
            else {
                while (socks < b) {
                    socks += a - 1;
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}
