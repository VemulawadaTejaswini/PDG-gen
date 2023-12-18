import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int sum=0;
        int c=0;
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            int ai=sc.nextInt();
            arr[i]=ai;
            sum=sum+ai;

        }



        if(arr[m-1]>=sum/(4*m))
            System.out.println("Yes");
        else System.out.println("No");










     }
}
