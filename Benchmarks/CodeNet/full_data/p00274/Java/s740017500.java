import java.util.Scanner;
public class Main{
    int n,k;
    int g=0,m=1;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n!=0){
            for(int s=0;s<n;s++){
                k = sc.nextInt();
                if(k>=2){
                    m++;
                }else if(k==1){
                 g++;
                }
            }
            if(m>=2){
                System.out.println(m+g);
            }else{
                System.out.println("NA");
            }
            g=0;
            m=1;
            n=sc.nextInt();
        }
    }
     
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}