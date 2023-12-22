import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int syu,mai,b,uri;
        for(int t=0; t<4; t++){
            syu = sc.nextInt();
            if(syu==1){
                b=6000;
                }else if(syu==2){
                    b=4000;
                }else if(syu==3){
                    b=3000;
                }else{
                    b=2000;
            }
            mai = sc.nextInt();
            uri = b*mai;
            System.out.println(uri);
        }
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}