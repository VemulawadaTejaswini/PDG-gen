import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 || String.valueOf(i).contains("3")){
                System.out.print(" " +i);
            }
        }
        System.out.println();
    }
}

