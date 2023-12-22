import java.util.Scanner;
public class Main{
 int a=0;
 int b=0;
 int c=0;
    
  public void solve(){
    Scanner sc= new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();  
      
    if(a<b&&b<c){
        System.out.println("YES");
    }else {
        System.out.println("NO");
    }
}

public static void main(String[] args){
    Main obj=new Main();
    obj.solve();
}
}