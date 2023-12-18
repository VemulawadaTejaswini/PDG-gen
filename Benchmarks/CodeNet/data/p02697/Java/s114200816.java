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
            for(int i = 0; i <= m/2; i++){
                System.out.println((m+1+i) + " " + (n-i));
            }
        }else{
            m++;
            for(int i = 0; i < m/2; i++){
                System.out.println((i+1) + " " + (m-i));
            }
            for(int i = 0; i < m/2; i++){
                System.out.println((m+1+i) + " " + (n-i));
            }
        }
    }
}
