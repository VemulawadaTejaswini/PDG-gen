import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a/3600);
        System.out.print(":");
        System.out.print((a%3600)/60);
        System.out.print(":");
        System.out.println((a%3600)%60);
        
        
        
    }
}

