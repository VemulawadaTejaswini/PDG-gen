import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int N;
        int num[];
        String line;

        Scanner scan=new Scanner(System.in);

        line=scan.next();
        N=Integer.parseInt(line);

        if(N<1||100<N){
            return;
        }
        
        num=new int[N];

        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(scan.next());
            if(num[i]<0||num[i]>100){
                return;
            }
        }

        //バブルソート
        int swap_num=0;
        for(int i=0;i<N-1;i++){
            for(int j=N-1;j>i;j--){
                if(num[j]<num[j-1]){
                    int temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;

                    swap_num++;
                }
            }
        }

        for(int i=0;i<N;i++){
             if(i==N-1)System.out.print(num[i]);
             else System.out.print(num[i]+" ");

        }
        System.out.println();
        System.out.println(swap_num);
    }
}
