import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong(); sc.nextLine();
       long total=1;
      
for(int i=0;i<n;i++){
  
total*=sc.nextLong();
}
//計算
      if(total>(long) Math.pow(10, 18)){
System.out.println("-1");
      }else{
		// 出力
		System.out.println(total);
 
      }
	}
}