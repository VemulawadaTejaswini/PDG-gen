import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		long i,j,result=0,n=s.nextInt(),k=s.nextInt();
		for(i=1;i<=n-2;i++) {
			for(j=1;j<=7-2;j++) {
				if((63*i+9*j+9)%11==k)
					result++;
			}
		}
		System.out.println(result);
	}
}