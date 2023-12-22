
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int sum = sc.nextInt();
            if(sum==0)break;
            int[] c = new int[4];
            int[] ans=new int[4];
            int[] p = {10,50,100,500};
            for (int i = 0; i < c.length; i++) {
                c[i]=sc.nextInt();
            }
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i]; j++) {
                    if(sum<=0){
                        break;
                    }
                    sum-=p[i];
                    ans[i]++;
                }
            }
            for (int i = 0; i < p.length; i++) {
                if(ans[i]==0)continue;
                System.out.println(p[i]+" "+ans[i]);
            }
            System.out.println();
        }
    }

}