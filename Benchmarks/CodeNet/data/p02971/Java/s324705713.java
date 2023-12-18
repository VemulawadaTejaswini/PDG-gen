import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0; int maxnum = 0;
		int second = 0;
		int a = 0;
		for(int i = 0; i < n; i++){
			a = Integer.parseInt(sc.next());
			if(a > second) second = a;
			if(second > max){
			second = max; max = a; maxnum = i;
			}
		}
		for(int i = 0; i < n; i++){
			if(i != maxnum){
				System.out.println(max);
			}else{
				System.out.println(second);
			}
		}
}
}
