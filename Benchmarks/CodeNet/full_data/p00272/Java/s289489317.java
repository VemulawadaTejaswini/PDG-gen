//２７３１松平　愛実
import java.util.Scanner;
class Main{
    int seki;
    int maisu;
    int cnt=0;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        seki = sc.nextInt();
        maisu = sc.nextInt();
        
        while(cnt<4){
            switch(seki){
                case 1:
                seki=6000;
                break;
                case 2:
                seki=4000;
                break;
                case 3:
                seki=3000;
                break;
                case 4:
                seki=2000;
                break;
            }
            cnt++;
            System.out.println(seki*maisu);
            seki = sc.nextInt();
        }
    }
        
        public static void main(String[]args){
            Main obj = new Main();
            obj.solve();
        }
    }