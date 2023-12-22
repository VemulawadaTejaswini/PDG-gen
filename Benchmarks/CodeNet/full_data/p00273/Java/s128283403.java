import java.util.Scanner;
    public class Main{
        public void solve(){
        Scanner sc = new Scanner(System.in);
        int x,y,b,p,kin;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            b = sc.nextInt();
            p = sc.nextInt();
            kin = (x*b)+(y*p);
            if(b>=5 && p>=2){
                double wari = kin*0.8;
                System.out.println(wari);
            }else{
                System.out.println(kin);
            }
        }
        }
    public static void main(String[]args){
    Main obj = new Main();
    obj.solve();
    }
    }