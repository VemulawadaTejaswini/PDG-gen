import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int k=scan.nextInt();
        int t=scan.nextInt();
        int[]a=new int[t];
        int max=0,sum=0;


        for(int i=0;i<t;i++){
            a[i]=scan.nextInt();
            if(a[i]>max){
                max=a[i];

            }
            else
                sum+=a[i];
        }
        if(max>sum) {
            if(t>=2)
            System.out.println(max - sum - 2);
            else
                System.out.println(max-sum-1);
        }
        else
            System.out.println(0);



    }
}