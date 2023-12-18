import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int laterIndex = n/2;
        if(n % 2 == 1){
            for(int i = 0; i < m; i++){
                System.out.println((i + 1) + " " + (n - i));
            }
        }else if(m % 2 == 0){
            for(int i = 0; i < m/2; i++){
                System.out.println((i + 1) + " " + (laterIndex - i));
            }
            for(int i = 0; i < m/2; i++){
                System.out.println((laterIndex+ i + 1) + " " + (n - i));
            }
        }else{
            for(int i = 0; i < m/2; i++){
                System.out.println((i + 1) + " " + (laterIndex - i));
            }
            for(int i = 0; i < m/2+1; i++){
                System.out.println((laterIndex+ i + 1) + " " + (n - i));
            }
        }
        
    }
}
