import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;

        c= a+b;
        int count=0;
        while(true){
            c /= 10;
            if(c != 0){
                count++;
            }else{
                break;
            }
        }

        System.out.println(count+1);

    }
}