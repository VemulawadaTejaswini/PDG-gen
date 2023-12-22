//2714 ???????????\ ???4
import java.util.Scanner;
    public class Main{
        int hozon=1;
        int ichi=0;
    
    public void solve(){
    Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
    while(N!=0){
            for(int cnt=0;cnt<N;cnt++){
            int k=sc.nextInt();
            if(k>=2){
            hozon++;
            }else if(k==1){
            ichi++;
            }
            }
            if(hozon>=2){
                System.out.println(hozon+ichi);
            }else{
                System.out.println("NA");
            }
            hozon=1;
            ichi=0;
            N=sc.nextInt();
        }
    }
    public static void main(String[] args){
        Main obj=new Main();
        obj.solve();
    }
}