import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int Nums[]=new int[3];
    
    Nums[0]=A+B;
    Nums[1]=A-B;
    Nums[2]=A*B;
    int Max=Nums[0];
    
    for(int i=1;i<Nums.length;i++){
     if(Nums[i-1]<Nums[i]){
     	Max=Nums[i];
     }
    }
    System.out.println(Max);
  }
}