import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a=0,b=0;
		int c=0,d=0;
		boolean e = true;
		for(;e;) {
			if(!e) break;
			a++;
			b++;
			for(int i = 0;i<a;i++) {
				
				if(!e)break;
				if(i%2 == 0) c=i/2;
				else c=-i/2;
				for(int j = 0;j<b; j++) {
					if(j%2 == 0)d=j/2;
					else d=-j/2;
					if(Math.pow(c, 5)-Math.pow(d, 5)==x) e =false;
					if(!e) break;
				}
			}
		}
		System.out.println(c+" "+d);
	}
}