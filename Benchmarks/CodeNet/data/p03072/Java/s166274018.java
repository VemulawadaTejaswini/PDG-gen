import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] hotel = new int[num];
        int i;
        for(i=0; i < num ;i++)
            hotel[i] = sc.nextInt();

        int ans = 0;
        int p = 0;

        for(int j =0; j<num ; j++){
            for(int k = j;k>0;k--){
                if(hotel[j] >= hotel[k]){
                    p = p+1;
                    System.out.println(p);
                }else{
                    p = 0;
                }
            if(p==j) {
                ans = ans + 1;
            }else{
                p = 0;
            }
            }
        }

        System.out.println(ans);
    }
}