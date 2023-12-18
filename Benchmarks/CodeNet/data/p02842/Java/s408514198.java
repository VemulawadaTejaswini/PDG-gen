import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long nn = sc.nextInt();
		
		long xx = (long) nn * 100 / 108;
		
		if((xx * 108) == nn * 100){
			System.out.print(xx);
		}else{
			System.out.print(":(");
		}
	}
}