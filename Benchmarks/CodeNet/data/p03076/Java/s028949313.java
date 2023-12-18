import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int aa = a % 10;
		int bb = b % 10;
		int cc = c % 10;
		int dd = d % 10;
		int ee = e % 10;
		
		int min = 100;
		if(min > aa){
		    min = aa;
		}if(min > bb){
		    min = bb;
		}if(min > cc){
		    min = cc;
		}if(min > dd){
		    min = dd;
		}if(min > ee){
		    min = ee;
		}
      
      	if(a%10 != 0){
		double aaa = (Math.ceil(a / 10))*10;
        }else{
         double aaa = a;
        }
      if(b%10 != 0){
		double bbb = (Math.ceil(b / 10))*10;
        }else{
         double bbb = b;
        }
      if(c%10 != 0){
		double ccc = (Math.ceil(c / 10))*10;
        }else{
         double ccc = c;
        }
      if(d%10 != 0){
		double ddd = (Math.ceil(d / 10))*10;
        }else{
         double ddd = d;
        }
      if(e%10 != 0){
		double eee = (Math.ceil(e / 10))*10;
        }else{
         double eee = e;
        }
      
		double zzz = aaa + bbb + ccc + ddd + eee + min -10;
      	int ans = (int)zzz;
		System.out.println(ans);
	}
}
