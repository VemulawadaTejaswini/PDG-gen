import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int count = 0;
		String st = sc.readLine();
		for(int i = 0;i < c.length;i++){
			for(char j:st.toCharArray()){
				if(j==c[i]){
					count++;
				}
			}
			sb.append(c[i]+" "+" "+count+"\n");
			count = 0;
		}
		System.out.print(sb);
	}
}