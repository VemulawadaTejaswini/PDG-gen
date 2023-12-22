import java.util.Scanner;

public class Main{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        while(true){
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int sum = m+f;
            if(m==-1 && f==-1 && r==-1) break;
            else if(m==-1 || f==-1 || sum<30){
                 System.out.println("F");
            }else if(sum>=80) {
                System.out.println("A");
            }else if(65<=sum && sum<80) {
                System.out.println("B");
            }else if(50<=sum && sum<65) {
                System.out.println("C");
            }else if(30<=sum && sum<50) {
                if(r>=50)System.out.println("C");
                else System.out.println("D");
            }
        }
    }
}
