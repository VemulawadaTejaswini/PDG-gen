import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        //scan number of P&A
        int N=scan.nextInt();
        int P=scan.nextInt();
        int[] A=new int[N];
        int odd=0,even=0;
        int count=0;
        int select_odd=0,select_even=1;
        int deno=1,mole_even=1,mole_odd=1;

        for(int i=0;i<N;i++){
            //scan A
            A[i]=scan.nextInt();
            if(A[i]%2==0) even++;
            else odd++;
        }

        //select_even
        for(int i=1;i<=even;i++){
            if(even>=5 && i>(double)even/2) i=even-i;
            //System.out.println(i);
            for(int j=1;j<=i;j++) deno*=j;
            for(int j=even-i+1;j<=even;j++) mole_even*=j;
            select_even+=mole_even/deno;
        }

        for(int i=P;i<=odd;i+=2){
            if(odd>=5 && i>(double)odd/2) i=odd-i;
            for(int j=1;j<=i;j++) deno*=j;
            for(int j=odd-i+1;j<=odd;j++) mole_odd*=j;
            select_odd+=mole_odd/deno;
        }
        /*if(P==1){
            for(int i=0;i<=odd;i+=2){
                if(odd>=5 && i>(double)odd/2) i=odd-i;
                for(int j=1;j<=i;j++) deno*=j;
                for(int j=odd-i+1;j<=odd;j++) mole_odd*=j;
                select_odd+=mole_odd/deno;
            }
        }else if(P==0){
            for(int i=2;i<=odd;i+=2){
                if(odd>=5 && i>(double)odd/2) i=odd-i;
                for(int j=1;j<=i;j++) deno*=j;
                for(int j=odd-i+1;j<=odd;j++) mole_odd*=j;
                select_odd+=mole_odd/deno;
            }
            select_odd+=1;
        }*/
        count=select_odd*select_even;
        //print num of count
        System.out.println(count);

    }
}
