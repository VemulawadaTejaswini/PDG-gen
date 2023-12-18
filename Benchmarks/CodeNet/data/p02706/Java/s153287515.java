import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tt = in.nextInt();
		int sum = 0;
		for(int qq=1; qq<=tt; qq++){
			sum += in.nextInt();
		}
		if(sum<=tt){
			System.out.println(tt-sum);
		}else{
			System.out.println("-1");
		}
	}
}