import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m % 2 == 1){
            for(int i = 0; i < m/2; i++){
                System.out.println((i+1) + " " + (m-i));
            }
            for(int i = 1; i <= m/2+1; i++){
                System.out.println((m+i) + " " + (n+1-i));
            }
        }else{
            for(int i = 0; i < m/2; i++){
                System.out.println((i+1) + " " + (m+1-i));
            }
            for(int i = 1; i <= m/2; i++){
                System.out.println((m+1+i) + " " + (n+1-i));
            }
        }
    }
}
