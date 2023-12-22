import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????
		String str[];
		int ans[] = new int[3];
		int stock;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        ans[0] = Integer.parseInt(str[0]);
        ans[1] = Integer.parseInt(str[1]);
        ans[2] = Integer.parseInt(str[2]);
        for(int i = 0; i < str.length; i++){
        	for(int j = i + 1; j < str.length; j++){
            	if(ans[j] < ans[i]){
            		stock = ans[i];
            		ans[i] = ans[j];
            		ans[j] = stock;
            	}
            }
        }
        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);

	}

}