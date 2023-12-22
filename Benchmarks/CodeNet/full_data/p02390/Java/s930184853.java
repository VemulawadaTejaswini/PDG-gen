import java.util.Scanner;
public class Main{
 int time;
 int h;
 int m;
 int s;
 
  
  public void solve(){
    Scanner sc= new Scanner(System.in);
    time= sc.nextInt();
    h=time/3600;
    m=(time-h*3600)/60;
    s=time-(h*3600+m*60);
    System.out.println(h+":"+m+":"+s);
}


public static void main(String[] args){
    Main obj=new Main();
    obj.solve();
}
}