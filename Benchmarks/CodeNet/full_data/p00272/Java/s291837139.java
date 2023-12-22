import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int syu,mai,a,uri;
        for(int t=0; t<4; t++){
            syu = sc.nextInt;
            if(syu==1){
                a=6000;
            }else if(syu==2){
                a=4000;
            }else if(syu==3){
                a=3000;
            }else if(syu==4){
                a=2000;
            }
            mai = sc.nextInt();
            uri = a * mai;
            System.out.println(uri);
        }
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}