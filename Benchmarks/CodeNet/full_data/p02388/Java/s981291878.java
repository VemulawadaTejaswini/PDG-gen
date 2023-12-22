import java.util.Scanner;
public class Main{
 int x;
 int seki=0;
  
  public void solve(){
    Scanner sc= new Scanner(System.in);
    x= sc.nextInt();
    seki=x*x*x;
    System.out.println(seki);

}


public static void main(String[] args){
    Main obj=new Main();
    obj.solve();
}
}