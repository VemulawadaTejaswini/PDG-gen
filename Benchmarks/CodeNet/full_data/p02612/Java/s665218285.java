import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
       int kazu=sc.nextInt();
      if(1000-(kazu%1000)!=0){
       System.out.println(1000-(kazu%1000));
      }else{
        System.out.println(0);
      }
}
}