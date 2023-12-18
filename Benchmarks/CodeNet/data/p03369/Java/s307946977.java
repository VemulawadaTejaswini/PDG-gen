import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
        String b[] = a.split("");
		int pay = 700;
        
      	for(int i = 0;i < 3;i++){
          if(b[i].equals("o")){
            pay += 100;
          }
        }
          System.out.println(pay);

 
      	
 
    }
}