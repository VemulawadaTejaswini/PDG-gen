import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = 0;


        for (int a=1;a<=n;a++) {
            int ans = 0;
            sq = (int)Math.sqrt(n) + 1;
            // 配列
            for(int x=1;x<=sq;x++){
                for(int y=x;x+y<=sq;y++){
                    for(int z=y;x+y+z<=sq;z++){
                        if(x*(x+y+z) + y*(y+z) + z*z == a) {
                            if(x!=y && x!=z && y!=z) {
                                ans+=6;
                            } else if(x==y && x==z) {
                                ans++;
                            } else {
                                ans+=3;
                            }
                        }
                    }
                }
            }
            System.out.println(ans);

        }




    }
}
