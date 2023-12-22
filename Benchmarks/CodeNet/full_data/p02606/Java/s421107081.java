import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        
        for(int i = L; i <= R; i+=d){
            count++;
        }
        
        System.out.println(count);
    }
}
