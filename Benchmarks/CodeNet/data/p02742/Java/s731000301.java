import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        long h = stdIn.nextLong();
        long w = stdIn.nextLong();

        if(h%2!=0 && w%2!=0){
            System.out.println((h*w+1)/2);
        }else{
            System.out.println(h*w/2);
        }
    }
}