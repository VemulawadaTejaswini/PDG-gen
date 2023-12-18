import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		int n5 = 0 ;
		int n7 = 0 ;
		for(int i = 0 ; i < a.length ; i++) {
			if(Integer.parseInt(a[i]) == 5)
				n5 ++ ;
			if(Integer.parseInt(a[i]) == 7)
					n7 ++ ;
		}
		if(n5 == 2 && n7 == 1) 
			System.out.println("YES");
		
	   else
		   System.out.println("NO");
	}

}
