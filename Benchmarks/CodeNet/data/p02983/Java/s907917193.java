import java.util.*;

public class Main {
    public static int map[][]=new int[11][11];
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();

        int diff=(R-L)%2019;
        int diff2=(R-L);

        L=L%2019;

        int temp=0;
        int ans=987654321;


        if(R>2019)
            R=2018;


        for(int i=L;i<L+diff;i++){

            for(int j=i+1;j<=L+diff2;j++){

                temp=((i%2019)*(j%2019))%2019;
                ans=Math.min(ans,temp);
            }

        }

        System.out.println(ans);
    }


}