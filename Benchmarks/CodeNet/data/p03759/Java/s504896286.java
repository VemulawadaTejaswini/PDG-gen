import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(b - a == c - b){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}