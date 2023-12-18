import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		sc.close();
		int[] q = new int[n];
		for(int i = 0 ; i < n ; i++) q[i] = (int)s.charAt(i) - 48;
		int yono = 0;
		int[] k = new int[3];
		int ke = 0;
		for(int i = 0 ; i < 1000 ; i++){
			k[2] = i % 10;
			k[1] = (i / 10) % 10;
			k[0] = (i / 100) % 10;
			ke = 0;
			boolean che = true;
			for(int j = 0 ; che && j < n ; j++){
				if(ke == 3){
					che = false;
					yono++;
				}else if(k[ke] == q[j]){
					ke++;
				}
				if(ke == 3){
					che = false;
					yono++;
				}
			}
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}