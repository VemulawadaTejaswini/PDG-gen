import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b&&b<c){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
   
        System.out.println();
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}