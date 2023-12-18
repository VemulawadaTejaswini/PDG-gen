import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		long i,j,result=0,n=s.nextInt(),k=s.nextInt();
		for(i=1;i<=n-2;i++) {
			for(j=18;j<=54;j+=9) {
				if((8*i+j)%11==k)
					result++;
			}
		}
		System.out.println(result);
	}
}