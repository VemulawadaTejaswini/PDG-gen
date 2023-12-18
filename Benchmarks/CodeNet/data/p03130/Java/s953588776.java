import java.util.*;

public class Main{
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[4];
    for(int i=0; i<6; i++){
      int temp=sc.nextInt();
      a[temp-1]++;
    }
    
    if(a[0]==3 || a[1]==3 || a[2]==3 || a[3]==3){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}
      
    
    
    