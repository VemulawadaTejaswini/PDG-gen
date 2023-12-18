import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] array=new int[N];
        for(int i=0;i<N;i++) {
            int x=sc.nextInt();
            array[i]=x;
        }
        int y=0;
        int z=array[0];
        int sum=0;
        int q=array[0];
        int sum2=0;
        while(y>0) {
            for(int i=1;i<array.length;i++) {
                if(z<array[i]) {
                    z=array[i];
                }
            }
            N--;
            y++;
            if(y>0) {
                for(int i=1;i<array.length;i++) {
                    if(q<array[i]) {
                        q=array[i];
                    }
                }
                N--;
                y++;
            }
            sum=sum+z;
            sum2=sum2+q;
        }
        System.out.println(sum-sum2);
    }
        

}