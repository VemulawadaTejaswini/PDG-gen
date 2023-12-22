import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i <n; i++) {
            ar[i]=in.nextInt();
        }
        int max=ar[0],count=0;
        for (int i = 1; i < n; i++) {
            if(ar[i]>=max){
                max=ar[i];
            }else{
                count=count+(max-ar[i]);
            }
        }
        System.out.println(count);
}
}