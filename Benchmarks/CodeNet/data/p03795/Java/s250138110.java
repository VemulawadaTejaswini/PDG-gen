import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        int y = 0;
        int x = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("食べた回数を入力してください：");
        String line = br.readLine();
        
        
        int n = Integer.parseInt(line);
        
        for (int i = 0;i < n;i++){
            x = x + 800;
            
                if (i / 15 == 0){
                    y = y + 200;
            } 
        } 
        
		System.out.println("今までに支払った金額…　" + x + "円");
		System.out.println("今までにもらった金額…　" + y + "円");
	}
}