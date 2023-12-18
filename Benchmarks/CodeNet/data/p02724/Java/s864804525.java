import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        
        System.out.println((x/500)*1000+((x%500)/5)*5);
    }
}
