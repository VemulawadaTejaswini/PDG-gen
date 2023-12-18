import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int third=(int)(N/100);
    N-=third*100;
    int second =(int)(N/10);
    N-=second*10;
    int first=N%10;
    if(third==7||second==7||first=7){
      System.out.println("YES");
    }else{
      System.out.ptintln("NO");
    }
    
  }
}
    