import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		String cd = vd.readLine();
		String[] fd = cd.split("");
		int n = Integer.parseInt(cd);
		int k =0;
		for(int i=0;i<fd.length;++i) {
			k=k+Integer.parseInt(fd[i]);
		}
		if(n%k==0) System.out.println("Yes");
		else System.out.println("No");
	}

}
