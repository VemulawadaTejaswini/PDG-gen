import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String s = sc.next();
			int k = 0;
			int start = 0;
			while(s.codePointAt(k)!=43) k++;
			String a = s.substring(start, k);
			k++;
			start = k;
			while(s.codePointAt(k)!=61) k++;
			String b = s.substring(start, k);
			String c = s.substring(k+1, s.length());
			
			String x, y, z;
			boolean flag = false;
			for(int i=0;i<10;i++){
				x = a;
				y = b;
				z = c;
				x = x.replaceAll("X", Integer.toString(i));
				y = y.replaceAll("X", Integer.toString(i));
				z = z.replaceAll("X", Integer.toString(i));
				if(Integer.valueOf(x) + Integer.valueOf(y) == Integer.valueOf(z)){
					System.out.println(i);
					flag = true;
					break;
				}
			}
			if(flag==false) System.out.println("NA");
		}
	}	
}