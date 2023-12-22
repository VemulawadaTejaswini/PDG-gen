import java.io.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String M = in.readLine();
		String k[] = new String[M.length()];
		for(int a = 0;a<M.length();a++){
			k[a] = M.substring(a,a+1);
			if(k[a].matches( "[a-z]+" )){
				k[a] = k[a].toUpperCase();
			}else{
				k[a] = k[a].toLowerCase();
			}
			System.out.print(k[a]);
		}
		System.out.println("");
	}
}