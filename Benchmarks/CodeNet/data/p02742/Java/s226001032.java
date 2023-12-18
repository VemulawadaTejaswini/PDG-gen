import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        long h,w;
        h=scan.nextLong();
        w=scan.nextLong();
        if((h*w)%2==1){
            System.out.println(h*w/2+1);
        }
        else if(h==1||w==1){
            System.out.println(1);
        }
        else System.out.println(h*w/2);
    }
}