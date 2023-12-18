import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = 0;
        int tmp = 2000000001;

        for(int L = l;L < r;L++){
            for(int R =l+1;R <= r;R++){
                ans = L*R%2019;

                if(tmp > ans){
                    tmp = ans;
                }
            }
        }
        System.out.println(tmp);
    }
}