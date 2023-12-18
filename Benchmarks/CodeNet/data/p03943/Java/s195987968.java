import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int candys[] = new int [3];
        for(int i = 0;i <= 2;i++){
            candys[i] = sc.nextInt();
        }
        Arrays.sort(candys);
        int max = candys[2];
        int a = 0;
        for(int i = 0;i <= 1;i++){
            a = a + candys[i];
            
        }
        if(max == a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
