import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] linearr;
		int n, x, i, j, k;
		int num;
		try{
			while(null != (line=reader.readLine())){
				num = 0;
				linearr = line.split(" ");
				n = Integer.parseInt(linearr[0]);
				x = Integer.parseInt(linearr[1]);
				if(n==0 && x==0){
					return;
				}
				for(i=1; i<=n; i++){
					for(j=i+1; j<=n; j++){
						for(k=j+1; k<=n; k++){
							//System.out.println("<i:"+i+", j:"+j+", k:"+k+">");
							if(i+j+k == x){
								num++;
							}
						}
					}
				}
				System.out.println(num);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}