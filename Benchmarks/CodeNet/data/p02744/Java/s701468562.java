import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i,j,k;
		int point = N-1;
		String w,w2;
		StringBuilder sb = new StringBuilder();
		for(i = 0;i < N;i++){
			sb.append("a");
		}
		w = sb.toString();
		System.out.println(w);
		for(i = 0;i < N;i++){
			w2 = w.substring(0,point);
			w2 += "b";
				Addabc(N,w2);
			point--;
		}
	}
	public static void Addabc(int max,String w2){
		char buf = 'a';
		if(w2.length() == max){
			System.out.println(w2);
			w2 = w2.substring(0,max - 1);
		}else{
			char end = w2.charAt(w2.length() - 1);
			int i = 0;
			while((end == 'a' && buf == 'c') || end < buf){
				buf += (char)i;
				String buf2 = String.valueOf(buf);
				w2 += buf2;
				Addabc(max,w2);
				i++;
			}
		}
	}
}