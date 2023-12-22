import java.util.Scanner;
public class Main{
    public void solve(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        int d=a*2+b*2;
        System.out.println(c+" "+d);
        
    }

    
 
         
    public static void main(String[]args){
         
        Main obj =new Main();
        obj.solve();
     
    }
}