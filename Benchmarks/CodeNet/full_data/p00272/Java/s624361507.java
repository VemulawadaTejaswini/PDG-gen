import java.util.Scanner;
public class Main{
    int seki[]={0,6000,4000,3000,2000};
    int b;   
    int a;
    int kin=0;
    public void solve(){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<5;i++){
        a = sc.nextInt();
        b = sc.nextInt();
        kin =seki[a]*b;
  
        
            
        System.out.println(kin);
        }
    }
    public static void main(String[] args){
      Main obj=new Main();
        obj.solve();
    }
}