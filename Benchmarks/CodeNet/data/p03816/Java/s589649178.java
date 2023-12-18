import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		Map<Integer , Integer> tm = new TreeMap<Integer , Integer>();
		int a;
		for(int i = 0 ; i < n ; i++){
			a = Integer.parseInt(sc.next());
			if(tm.containsKey(a)){
				tm.put(a , tm.get(a) + 1);
			}else{
				tm.put(a , 1);
			}
		}
		sc.close();
		int yono = 0;
		int sum = 0;
		for(int i : tm.keySet()){
			a = tm.get(i) % 2;
			if(a == 0){
				a += 2;
				yono++;
			}
			sum += a;
		}
		sum -= yono;
		if(yono == 1) sum--;
		ou.println(sum);
		ou.flush();
    }
}