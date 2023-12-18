import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        String ans = "first";
        boolean flg=true;
        for(int i=0;i<p;i++){
            int x= scan.nextInt();
            x-=1;
            if(x%2==1){
                if(flg){
                    ans="second";
                    flg=false;
                }else{
                    ans="first";
                    flg=true;
                }
            }
        }
        System.out.println(ans);
    }
}