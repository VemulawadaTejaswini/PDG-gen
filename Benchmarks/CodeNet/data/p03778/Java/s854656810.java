import java.util.*;
public class ABC056_B {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int W=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
		if(Math.abs(b-a)<W){
			System.out.println("0");
		}
		else{
			System.out.println(b-(a+W));
		}
	}
}