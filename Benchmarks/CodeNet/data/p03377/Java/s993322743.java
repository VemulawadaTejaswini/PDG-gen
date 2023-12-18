import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int X=scanner.nextInt();
        if(X>=A&&A+B>=X){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
