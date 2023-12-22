//問3　2717 佐久間 翼
import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int kaisu=1;
        int ichi=0;
        int N=sc.nextInt();
        while(N!=0){
        for(int cnt=0;cnt<N;cnt++){
            int k=sc.nextInt();
            if(k>=2){
                kaisu++;
            }else if(k==1){
                ichi++;
            }
        }
        if(kaisu>=2){
            System.out.println(kaisu+ichi);
        }else{
            System.out.println("NA");
        }
        kaisu=1;
        ichi=0;
        N=sc.nextInt();
            
    }
    }
            
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}