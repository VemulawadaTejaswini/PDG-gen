import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//数値
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
      	//配列
        int m[] = new int[n];
        for(int i = 0; i < n; i++){
        	m[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(m);
        for(int i = 0; i < n; i++){
        	x -= m[i];
        }
        int wari  = x/m[0];
        System.out.println(m.length+wari);
     }
}	