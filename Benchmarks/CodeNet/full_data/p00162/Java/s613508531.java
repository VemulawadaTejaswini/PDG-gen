import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ham = new int[1000001];
		for ( int i = 1; i < 1000001; i++ ) {
			int tmp = i;
			while(tmp%5==0)tmp/=5;
			while(tmp%3==0)tmp/=3;
			while(tmp%2==0)tmp/=2;
			ham[i]=tmp;
		}
		while ( !sc.hasNext("0") ) {
			int m = sc.nextInt() , n = sc.nextInt() , count=0;
			for ( ; m <= n; m++ )
				if( ham[m] == 1) count++;
			System.out.println(count);
		}
	}
}