import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        int ar[]=new int[test];
        int n=in.nextInt();
        long sum=0;int count=1;
        for (int i = 0; i < test; i++) {
            ar[i]=in.nextInt();
            sum=sum+ar[i];
            if(sum<=n){
                count++;
            }
        }
        System.out.println(count);
    }
}