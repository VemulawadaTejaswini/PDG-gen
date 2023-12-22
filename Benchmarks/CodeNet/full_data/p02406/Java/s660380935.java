import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());

		int x=1;

		while(n>=x){
			if(x!=n){
				if(x%3==0){
					System.out.print(" "+x);
				}else if(x%10==3){
					System.out.print(" "+x);
				}
			}else{
				if(x%3==0){
					System.out.println(" "+x);
				}else if(x%10==3){
					System.out.println(" "+x);
				}
			}
			x++;
		}
	}

}

