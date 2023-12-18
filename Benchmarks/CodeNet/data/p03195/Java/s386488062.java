import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        String ans = "second";
        boolean flg=true;
        for(int i=0;i<p;i++){
            int x= scan.nextInt();
            if(x%2==1){
                if(flg){
                    ans="first";
                    flg=false;
                }else{
                    ans="second";
                    flg=true;
                }
            }
        }
        System.out.println(ans);
    }
}