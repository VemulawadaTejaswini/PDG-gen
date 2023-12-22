import java.util.Scanner;
public class Main{
 int a;
 int b;
 
  public void solve(){
    Scanner sc= new Scanner(System.in);
    a= sc.nextInt();
    b=sc.nextInt();
      
    if(a<b){
        System.out.println("a<b");
    }else if(a>b){
        System.out.println("a>b");
    }else if(a==b){
        System.out.println("a==b");
    }
}

public static void main(String[] args){
    Main obj=new Main();
    obj.solve();
}
}