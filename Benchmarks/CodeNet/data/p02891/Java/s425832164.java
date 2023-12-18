import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		String s = sc.next();
		char[] a = new char[s.length() + 1];
		for(int i = 0 ; i < s.length() ; i++){
			a[i] = s.charAt(i);
		}
		a[s.length()] = '鳥';
		long yono = 0;
		int k = Integer.parseInt(sc.next());
		boolean ebiebiebi = true;
		for(int i = 1 ; i < s.length() ; i++){
			if(a[i] != a[i - 1]) ebiebiebi = false;
		}
		if(s.length() == 1){
			yono = k / 2;
		}else if(ebiebiebi){
			yono = (s.length() * (long)k + 1) / 2;
		}else{
			for(int i = 0 ; i < s.length() - 1 ; i++){
				if(a[i] == a[i + 1]){
					int yo = 0;
					while(a[i] == a[i + 1]){
						yo++;
						i++;
					}
					yono += (yo + 1) / 2;
				}
			}
			yono *= (long)k;
			if(a[0] != a[1] && a[0] == a[s.length() - 1] && a[s.length() - 1] != a[s.length() - 2]){
				yono += k - 1;
			}
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}