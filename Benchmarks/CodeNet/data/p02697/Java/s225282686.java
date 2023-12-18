import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            if(n % 2 == 0 && i == 0){
                System.out.println((i+1) + " " + (m*2+1));
            }else{
                System.out.println((i+1) + " " + (m*2-i));
            }
            
        }
    }
}
