import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//　敵の体力
		int h = sc.nextInt();
      
      	for(int i=0;h>=Math.pow(2,i);i++){
          if(h<Math.pow(2,i+1)){
		    System.out.println((int)Math.pow(2,i+1)-1);
          }
		}
     }
}
