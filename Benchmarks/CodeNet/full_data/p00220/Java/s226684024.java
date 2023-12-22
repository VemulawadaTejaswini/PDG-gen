import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        double d = sc.nextDouble();
        while(d!=-1.0){
            d *= 16.0;
            int d2 = (int)d;
            if(d>d2){
                System.out.println("NA");
                d = sc.nextDouble();
                continue;
            }

            String ans = "";
            while(d2>0){
                if(d2%2==1) ans = "1" + ans;
                else ans = "0" + ans;
                d2 /= 2;
            }


            String ans1 = ans.substring(0, ans.length()-4);
            String ans2 = ans.substring(ans.length()-4, ans.length());
            while(ans1.length()<8) ans1 = "0" + ans1;
            while(ans2.length()<4) ans2 += "0";
            ans = ans1 + "." + ans2;
            if(ans.length()>13){
                System.out.println("NA");
                d = sc.nextDouble();
                continue;
            }
            System.out.println(ans);
            d = sc.nextDouble();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}