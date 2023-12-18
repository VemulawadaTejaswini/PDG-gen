import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);

        int h=scan.nextInt();
        int w=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        long [][]map=new long [h+1][w+1];

        long waru=1000000007;


        for(int i=h-1;i>=0;i--){
            for(int j=w-1;j>=0;j--){
                if(i==h-1 &&j==w-1)
                    map[i][j]=1;
                else
                    map[i][j]=(map[i][j+1]+map[i+1][j])%waru;

                if(j<=b-1 && i>=h-a)
                    map[i][j]=0;
            }
        }

        System.out.println(map[0][0]);
    }
}