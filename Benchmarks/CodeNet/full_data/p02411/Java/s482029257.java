//Accepted
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String work[]=new String[3];
		int m;
		int f;
		int r;

		//入力
		try {
			while(true){
				//nとmとrの入力
				work=br.readLine().split("\\s+");
				m=Integer.parseInt(work[0]);
				f=Integer.parseInt(work[1]);
				r=Integer.parseInt(work[2]);
			
				if(m==-1 && f==-1 && r==-1) {break;}
				
				if(m==-1 || f==-1) {	//Fの判定
					sb.append("F");
					sb.append(String.format("%n", ""));
				}else if(m+f >= 80) {	//Aの判定
					sb.append("A");
					sb.append(String.format("%n", ""));
				}else if(m+f >= 65) {
					sb.append("B");
					sb.append(String.format("%n", ""));
				}else if(m+f >= 50) {
					sb.append("C");
					sb.append(String.format("%n", ""));
				}else if((m+f>=30) && (r>=50)) {
					sb.append("C");
					sb.append(String.format("%n", ""));
				}else if(m+f >= 30){
					sb.append("D");
					sb.append(String.format("%n", ""));
				}else {
					sb.append("F");
					sb.append(String.format("%n", ""));
				}
				
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//出力
		System.out.print(sb);
	}
	
}
