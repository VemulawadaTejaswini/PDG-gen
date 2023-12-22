import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int max=0 ,mid=0 ,min=0;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a<b||b<c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scan.close();
    }
}
