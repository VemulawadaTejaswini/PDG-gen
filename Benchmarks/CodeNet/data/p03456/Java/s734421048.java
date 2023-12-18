import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int value = Integer.parseInt(a + b);
		if(value % 2 == 0){
			for(int i = value; i > 0; i -= 2){
				if(i * i == value){
					System.out.println("Yes");
					return;
				}
			}
		}else{
			for(int i = value; i > 0; i -= 2){
				if(i * i == value){
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
