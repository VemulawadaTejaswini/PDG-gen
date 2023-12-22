import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public void run(){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int max = 0;
		for(int i = 0; i < m;i++)
		{
			int buf = 0;
			for(int j = 0 ; j < n; j++){
				if(sc.nextInt() == 1) buf++;
			}
			max = Math.max(max, buf);
		}
		System.out.println(max);
	}
	public static void main(String Args[]){
		Main t = new Main();
		t.run();
	}
}