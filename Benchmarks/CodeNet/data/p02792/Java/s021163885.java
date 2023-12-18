import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {

        int ans=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] c = new int[10][10];
        for(int i=0;i<10;i++)for(int j=0;j<10;j++)c[i][j]=0;

        for(int i=1;i<=n;i++){
            String tempA = String.valueOf(i);
            int al=Integer.parseInt(tempA.substring(0,1));
            int ar=Integer.parseInt(tempA.substring(tempA.length()-1,tempA.length()));
            //System.out.println(al+" "+ar);

            for(int l=0;l<10;l++){
                for(int r=0;r<10;r++){

                    if(al==l&&ar==r){
                        c[l][r]++;
                    }
                }
            }
        }

        for(int i=0;i<10;i++)for(int j=0;j<10;j++){
            ans += c[i][j]*c[j][i];
        }

        System.out.println(ans);
    }

}
