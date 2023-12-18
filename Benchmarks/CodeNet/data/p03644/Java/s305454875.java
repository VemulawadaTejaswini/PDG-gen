import java.util.*; 
 
public class Main{
  
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);     
    int N = sc.nextInt();
    while(N>0){
      if(N%2==0){
        System.out.println(N);
        break;
      }else{
        N--;
      }
    }
  }
}