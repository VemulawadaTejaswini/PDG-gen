
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		String ans[] = new String[count];
		
		for (int i = 0; i < count; i++) {
			String s = br.readLine();
			
			StringTokenizer st = new StringTokenizer(s);
			
			int num[] = new int[4];
			for (int j = 0; j < 3; j++) {
				num[j] = Integer.parseInt(st.nextToken());
				if (num[0] < num[j]) {
					int tmp = num[0];
					num[0] = num[j];
					num[j] = tmp;
				}
			}
			if (num[0] * num[0] == num[1] * num[1] + num[2] * num[2]){
                ans[i] = "YES";
            }else{
                ans[i] = "NO";
            }
		}	
		for(int i=0;i<count;i++){
			System.out.println(ans[i]);
        }
	}
}