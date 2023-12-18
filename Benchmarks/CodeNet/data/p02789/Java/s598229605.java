import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),b=scan.nextInt();
        
        if(b>=a){
            System.out.println(a.repeat(b));
        }
        else{
            System.out.println(b.repeat(a));
        }
    }
}
