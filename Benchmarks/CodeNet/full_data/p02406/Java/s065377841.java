import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buf.readLine());
		StringBuilder sb = new StringBuilder();
		
		int num = 0;
		for(int j=3; j<=n; j++){
			if(j%3==0){
				sb.append(" "+j);
			} else {
				num = j;
				while(num != 0){
					if(num%10==3){
						sb.append(" "+j);
						break;
					} else{
						num = num/10;
					}	
				}
			}			

		}
		System.out.println(sb);
	}
}