import java.util.Scanner;
public class Main{
  int a;
  int b;   
  int sa;  
    public void solve(){
        Scanner sc=new Scanner(System.in);
        for(int hi=0; hi<8 ; hi++){
        a = sc.nextInt();
        b = sc.nextInt();
        sa =a-b;
            
        System.out.println(sa);
    }
    }
    public static void main(String[] args){
      Main obj=new Main();
        obj.solve();
    }
}