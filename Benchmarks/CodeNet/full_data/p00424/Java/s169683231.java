import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
public class Main {
	Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		new Main();	
	}
 
	public Main() {
		new B().doIt();
	}
	class B{
		void set(char ctr[]){
			for(char c = '0';c <= '9';c++)ctr[c] = c;
			for(char c = 'a';c <= 'z';c++)ctr[c] = c;
			for(char c = 'A';c <= 'Z';c++)ctr[c] = c;
		}
		char cs(){
			char ctr[] = sc.next().toCharArray();
			return ctr[0];
		}
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				char ctr[] = new char[128];
				set(ctr);
				String s1 = "";
				String s2 = "";
				for(int i = 0;i < n;i++){
					s1 = sc.next();
					s2 = sc.next();
					char c1[] = s1.toCharArray();
					char c2[] = s2.toCharArray();
					ctr[c1[0]] = c2[0];
				}
				StringBuilder sb = new StringBuilder();
				int m = sc.nextInt();
				for(int i = 0;i < m;i++){
					sb.append(ctr[cs()]);
				}
				System.out.println(sb);
			}
		}
	}
}