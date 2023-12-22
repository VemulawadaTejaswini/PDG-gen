
import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            //?????°
            int n = sc.nextInt();
            //??????????????°
            int r = sc.nextInt();
            if(n==0 && r==0)
            {
                break;
            }
            int card[] = new int[n];
            //?????????
            for(int i=0; i<n; i++)
            {
                card[i]=i+1;
            }
            for(int i=0; i<r; i++)
            {
                int p=sc.nextInt();
                int c=sc.nextInt();
                //??????????????????????????£?????????
                int tcard[] = new int[n];
                for(int j=0; j<n; j++)
                {
                    tcard[j]=card[j];
                }
                //??\?????????
                for(int j=0; j<c; j++)
                {
                    card[j]=tcard[p-1+j];
                }
                for(int j=c; j<p-1+c; j++)
                {
                    card[j]=tcard[j-c];
                }
            }
            System.out.println(card[0]);
        }

        sc.close();
    }
}