import java.util.*;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(sc.nextLine()),sm = 0;
        String[] a = sc.nextLine().split(" ");
        for (int i = 0;i < a.length;i++){
            for (int j = i + 1;j < a.length ;j++){
                sm += Integer.parseInt(a[j]) * Integer.parseInt(a[i]);
            }
            
        }
        
        System.out.println(sm % 1000000007);
    }
}