import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] a)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int data[] = new int[10];

		for(int i = 0; i < 10; i++){
			data[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(data);

		for(int i = 9; i >= 7; i--) System.out.printf("%d\n", data[i]);
    }
}