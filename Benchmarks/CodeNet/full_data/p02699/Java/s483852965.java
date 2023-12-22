import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long w = sc.nextLong();
		if(s<=w){
			System.out.println("unsafe");
		}else{
			System.out.println("safe");
		}
	}
}