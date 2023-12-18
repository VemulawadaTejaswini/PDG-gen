import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        String ans = "first";
        boolean flg=true;
        boolean flgsub=false;
        for(int i=0;i<p;i++){
            int x= scan.nextInt();
            if(x%2==0){
                if(flg){
                    ans="second";
                    flg=false;
                }else{
                    ans="first";
                    flg=true;
                }
                if(flgsub){
                    if(flg){
                        ans="second";
                        flg=false;
                    }else{
                        ans="first";
                        flg=true;
                    }
                }
                flgsub=true;
            }else{flgsub=true;}
        }
        System.out.println(ans);
    }
}