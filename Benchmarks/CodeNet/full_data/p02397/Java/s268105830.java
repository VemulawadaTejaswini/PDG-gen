import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args){

		String str = null;
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean b = true;
		String[] str1;
		int n1,n2;
		
		for(;b;){
		
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}
		
		
		str1 = str.split(" ");
		n1 = Integer.parseInt(str1[0]);
		n2 = Integer.parseInt(str1[1]);
		
		if(n1==0 && n2==0){
			b = false;
			break;
			}
		
		if(n1>n2){
		System.out.println(n2+" "+n1);
		}else{
			System.out.println(n1+" "+n2);
		}
		
		
		}
		
	}
}