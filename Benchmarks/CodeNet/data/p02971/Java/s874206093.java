import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		
		int m1 = 0, i1 = 0, m2 = 0, i2 = 0;
		for(int i = 0; i < n; i++) {
			if(array[i] >= m1) {
				m2 = m1;
				i2 = i1;
				m1 = array[i];
				i1 = i;
			} else if(array[i] > m2) {
				m2 = array[i];
				i2 = i;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(i == i1)
				System.out.println(m2);
			else
				System.out.println(m1);
		}
	}
}
