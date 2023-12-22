import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] a;
		int x,y;
		while(true){
			a=br.readLine().split(" ");
	        x=Integer.parseInt(a[0]);
	        y=Integer.parseInt(a[1]);
	        if(x==0&&y==0){
	        	break;
	        }else if(x>y){
	        	sb.append(y+" "+x+"\n");
	        }else{
	        	sb.append(x+" "+y+"\n");
	        }
		}
		System.out.print(sb.toString());
	}
}