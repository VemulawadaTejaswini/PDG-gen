import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) {
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	double JPYcnt = 0;
      	double BTCcnt = 0;
      	for(int i=0;i<N;i++){
        	double x = sc.nextDouble();
          	String u =sc.next();
          	if(u.equals("JPY")){
            	JPYcnt += x;
            }else{
            	BTCcnt += x;
            }
        }
      	System.out.println(JPYcnt+BTCcnt*380000.0);
    }
}