import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int h,a,con;
        con=0;
        h = scan.nextInt();
        a = scan.nextInt();
        while(a<h){
            con+=1;
            h-=a;
        }
        System.out.println(con);
    }
}