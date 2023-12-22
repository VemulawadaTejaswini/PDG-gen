import java.util.Scanner;
public class Main{
	static Double Long[]=new Double[3];
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int c1 = 0;
		int c2 = 0;
		String numbers;
		while(sc.hasNext()){
			numbers = sc.next();
			String str[]=numbers.split(",");
			for(int i = 0;i < 3;i++){
				Long[i]=Double.parseDouble(str[i]);
			}
				if(Long[0]<Long[1]){
					double temp = Long[0];
					Long[0] = Long[1];
					Long[1] = temp;
				}
			
			if(Check(Long[0],Long[1],Long[2])){
				continue;
			}
			if(Check2(Long[0],Long[1],Long[2])){
				c1++;
			}else if(Check3(Long[0],Long[1],Long[2])){
				c1++;
			}else{
				c2++;
			}
		}
		System.out.println(c1);
		System.out.println(c2);
		}
		public static boolean Check( double a,double b,double c){//??£?????¢????¢????
			if(a==b){
				if( a==c){
					return true;
				}
		}
			return false;
	}
		public static boolean Check2(double a,double b,double c){//????????¢????¢???????
			if(a == c/2){
				if(b == Math.sqrt(a*3)){
					return true;
				}
			}
			return false;
		}
		public static boolean Check3(double a,double b,double c){//????????¢????¢???????
			if(Math.pow(c,2.0)==Math.pow(b, 2.0)+Math.pow(a,2.0)){
				return true;
			}
		return false;
		}
}