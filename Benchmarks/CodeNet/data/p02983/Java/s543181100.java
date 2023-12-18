import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int l=scan.nextInt();
        int r=scan.nextInt();
        int a=r-l;
        int b=0;
        int ans=100000000;
        for(int i=l;i<=r;i++){
            for(int k=1;k<=a;k++){
                b=(l*(l+k))%2019;
                if(b<ans){
                    ans=b;
                }
            }
        }

        System.out.println(ans);
    }
}
