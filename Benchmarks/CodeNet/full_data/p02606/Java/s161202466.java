import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner sc=new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();
    int d = sc.nextInt();
    
    int counter=0;
    for(int i=L;i<=R;i++){
      if(i%d==0) counter++;
    }
    System.out.print(counter);
  }
}