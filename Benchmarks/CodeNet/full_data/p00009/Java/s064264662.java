import java.io.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);		
		
		while(true){
		String str =  br.readLine();
		if(str == null)break;
		int n = Integer.parseInt(str);
		
		int[] sosu = new int[100000];
		int cs=0;
		
		int count = 0;
		if(n > 1) {
			count++;
			sosu[cs++] = 2;
		}
		if(n > 2){
			sosu[cs++] = 3;
			count++;
		}
		for(int i = 5; i < n+1; i+=2){
			boolean f = true;
			for(int j = 1; sosu[j]*sosu[j]  <= i; j++){
				if(i%sosu[j] == 0) {
					f = false;
					break;
				}
			}
			if(f){
				count++;
				sosu[cs++] = i;
			}
		}
		System.out.println(count);
	}

}
}