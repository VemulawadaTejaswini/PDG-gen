import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		int in[] = new int[s.length];
		for(int i=0;i<s.length;i++){
			in[i] = Integer.parseInt(s[i]);
		}
		System.out.println(in[0]/in[1]+" "+in[0]%in[1]+" "+String.format("%.5f",(double)in[0]/in[1]));
	}
}