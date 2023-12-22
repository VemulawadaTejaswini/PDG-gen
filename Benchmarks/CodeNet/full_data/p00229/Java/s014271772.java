import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
         int b=sc.nextInt()*5,r=sc.nextInt()*3,g=sc.nextInt(),c=sc.nextInt(),s=sc.nextInt(),t=sc.nextInt();
         if((b|r|g|c|s|t)==0) {
             break;
         }
         System.out.println(100+b+b*18+r+r*20+g*7+c*2-(t-s)*3);
        }
    }
}
