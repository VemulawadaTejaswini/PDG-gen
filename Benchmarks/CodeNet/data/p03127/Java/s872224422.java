import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int monsters[] = new int[n];
        int min = 1000000000;
        for(int i=0; i<n; i++){
            monsters[i] = sc.nextInt();
            if(min > monsters[i]) min = monsters[i];
        }

        while(min != 1){
          	if(min == 1000000000) break;
            int i;
            for(i=0; i<n; i++){
                if(monsters[i] % min != 0) break;
            }
            if(i == n) break;
            min--;
        }
        System.out.println(min);
    }
}