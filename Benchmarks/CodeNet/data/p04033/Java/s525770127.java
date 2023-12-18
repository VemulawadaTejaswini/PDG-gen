import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int sum = 1;
		for(int i = a; i < b+1; i++){
			sum *= i;
		}
		if(sum<0){
			System.out.println("Negative");
		}else if(sum>0){
			System.out.println("Positive");
		}else{
			System.out.println("Zero");
		}
	}
}