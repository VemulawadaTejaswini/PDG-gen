import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int[] list = new int[N];
        int Max = 0;
        int all = 0;
        for(int i = 0; i < N; i++){
           list[i] = sc.nextInt();
           if(list[i] > Max){
             Max = list[i];
           }
           all += list[i];
        }
      
       all -= Max;
       if(Max < all){
         System.out.println("Yes");
       }else{
         System.out.println("No");
       }
      
	}

}