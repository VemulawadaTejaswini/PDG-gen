import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int length[] = new int[num];
        int ans = 0;
        for (int i = 0; i < num; i++) {
            length[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++){
            int a = length[i];
            for(int j = i + 1; j <num; j++){
                int b = length[j];
                for(int k = j + 1; k < num; k++){
                    int c = length[k];
                    if((a < (b+c)) && (b < (c + a)) && (c < (a + b))){
                        ans ++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}