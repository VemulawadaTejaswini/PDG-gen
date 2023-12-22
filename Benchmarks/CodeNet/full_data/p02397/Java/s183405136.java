import java.io.*;

class C_SwappingTwoNumbers2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		while(true){
			String[] ary = br.readLine().split(" ");
	        int x = Integer.parseInt(ary[0]);
	        int y = Integer.parseInt(ary[1]);
			if(x==0&&y==0) break;
	        if(x>y){
	        	sb.append(y+" "+x+"\n");
	        }else{
	        	sb.append(x+" "+y+"\n");
	        }
		}
		System.out.print(sb);
	}
}