import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		Map<Long , Long> tm = new TreeMap<Long , Long>();
		int n = Integer.parseInt(sc.next());
		long m = Long.parseLong(sc.next());
		long a = 0;
		long b = 0;
		for(int i = 0 ; i < n ; i++){
			a = Long.parseLong(sc.next());
			b = Long.parseLong(sc.next());
			if(tm.containsKey(a)){
				tm.put(a , b + tm.get(a));
			}else{
				tm.put(a , b);
			}
		}
		sc.close();
		long yono = 0;
		for(long i : tm.keySet()){
			yono += i * tm.get(i);
			m -= tm.get(i);
			if(m <= 0){
				yono += i * (long)m;
				break;
			}
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}