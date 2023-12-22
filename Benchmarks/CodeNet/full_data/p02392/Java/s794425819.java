import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        biggest(a, b, c);
        
    }
    public static void biggest(int a, int b, int c){
        if(a < b && b < c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

