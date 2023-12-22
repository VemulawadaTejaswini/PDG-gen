import java.util.Scanner;
public class Main{
    public void solve(){
    Scanner sc = new Scanner(System.in);
    int t,n;
        for(int i=0;i<=3;i++){
        t = sc.nextInt();
        n = sc.nextInt();
        if(t==1){
            int kei = 6000*n;
            System.out.println(kei);
        }else{
            if(t==2){
                int kei = 4000*n;
                System.out.println(kei);
                }else{
                    if(t==3){
                        int kei = 3000*n;
                        System.out.println(kei);
                        }else{
                        int kei = 2000*n;
                        System.out.println(kei);
                    }
            }
        }
    }
    }
        public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}