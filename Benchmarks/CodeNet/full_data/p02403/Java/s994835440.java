import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a!=0 && b!=0){
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    System.out.printf("#");
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
            a=sc.nextInt();
            b=sc.nextInt();
        }
    }
}
