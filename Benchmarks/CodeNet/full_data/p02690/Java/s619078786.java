import java.util.*;
public class Main {
    public static long five(long x){
    return x*x*x*x*x;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
        long a = 0;
		long b = 0;
        for(long i=-100;i<=100;i++){
        for(long j=-100;j<=100;j++){if(five(i)-five(j)==x){a=i;b=j;break;}}}
		System.out.println(a + " " + b);
	}
}