import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int state=0;

		String a = br.readLine();
		String b = br.readLine();
		
		boolean flag=true;
		for(int i=0;i<a.length();i++){
			flag=true;
			if(i+b.length()>a.length()){
				break;
			}
			for(int j=0;j<b.length();j++){
				if(a.charAt(i+j)!=b.charAt(j)){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(i);
			}
		}
	}

}

