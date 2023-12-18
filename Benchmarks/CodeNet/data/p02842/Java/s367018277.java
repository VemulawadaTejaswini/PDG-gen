import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int price =(int)(N/1.08);
        if((int)(price*1.08) != N){
          if((int)((price+1)*1.08) != N){
            if((int)((price-1)*1.08) != N){
              System.out.println(":(");
            }else{
              System.out.println(price-1);
            }
          }else{
            System.out.println(price+1);
          }
        }else{
          System.out.println(price);
        }
	}
}