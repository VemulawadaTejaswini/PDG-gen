import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();
        int[] a=new int[200000];

        for(int i=0;i<N;i++)
        {
            a[i]=scan.nextInt();
        }

        int x=a[0];
        int y=a[N-1];
        int diffe=Math.abs(x-y);

        int i=0;
        int j=N-1;

        if(N==2){
            System.out.println(diffe);
        }else{
            while(true) {
                if (Math.abs((x + a[i+1]) - y) < diffe) {
                    i++;
                    x += a[i];
                } else if (Math.abs((y + a[j-1]) - x) < diffe) {
                    j--;
                    y += a[j];
                }
                if (j>i && j - i == 1) break;
            }
            System.out.println(Math.abs(x-y));
        }
    }
}
