import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        char[][] s = new char[h][w];
        long ans = Long.MAX_VALUE;

        for(int i=0;i<h;i++)s[i] = sc.next().toCharArray();

        //System.out.println("loaded");

        for(int i=0;i<Math.pow(2,h-1);i++){
            int count = 0;
            boolean[] yoko = new boolean[h-1];
            int yokosen = 0;
            int temp = i;
            for(int j=0;j<h-1;j++){
                if(i%2==1){
                    yoko[j]=true;
                    yokosen++;
                }
                else yoko[j]=false;
                i = i>>1;
            }
            i = temp;
            count += yokosen;

            int intChoco[][] = new int[yokosen+1][w];
            int trigger = 0;
            for(int j=0;j<yokosen+1;j++)for(int l=0;l<w;l++)intChoco[j][l]=0;

            for(int j=0;j<h;j++){
                for(int l=0;l<w;l++){
                    if(s[j][l]=='1')intChoco[trigger][l]++;
                }
                if(j==h-1)break;
                if(yoko[j])trigger++;
            }

            /*
            System.out.println("---");
            for(int j=0;j<yokosen+1;j++){
                for(int l=0;l<w;l++) System.out.print(intChoco[j][l]);
                System.out.println();
            }
            */


            //各横線パターンでのチョコを作った後

            int container[] = new int[yokosen+1];
            for(int l=0;l<yokosen+1;l++)container[l]=0;

            for(int j=0;j<w-1;j++){
                for(int l=0;l<yokosen+1;l++){
                    container[l]+=intChoco[l][j];
                }

                for(int l=0;l<yokosen+1;l++){
                    if(container[l]+intChoco[l][j+1]>k){
                        count++;
                        for(int m=0;m<yokosen+1;m++)container[m]=0;
                    }
                }
            }

            //System.out.println(count+" "+i);
            ans = Math.min(ans,count);

        }
        System.out.println(ans);

    }
}
