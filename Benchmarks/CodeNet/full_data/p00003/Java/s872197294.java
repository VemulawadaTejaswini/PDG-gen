import java.io.*;


public class Main {
	public static void main(String[] args)  throws IOException
	{
	    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(buf.readLine());
	    String[] list;
	    String[] check = new String[N];
	    int i,j,l;
	    for(int k=0; k<N; k++){
	        list = buf.readLine().split(" ");
	        i = Integer.parseInt(list[0]);
	        j = Integer.parseInt(list[1]);
	        l = Integer.parseInt(list[2]);
	        check[k] = Check(i,j,l);
	    }
	    for(int k = 0; k<N; k++){
	    	System.out.println(check[k]);
	    }
	    
	}
	
	public static String Check(int a,int b,int c){
		if(a-b >0 && a-c>0){
			if(a*a == b*b + c*c){
				return"YES";
			}else{
				return "NO";
			}
		}else if(b-a >0 && b-c>0){
			if(b*b == a*a + c*c){
				return "YES";
			}else{
				return "NO";
			}
		}else{
			if(c*c == b*b + a*a){
				return "YES";
			}else{
				return "NO";
			}
		}
	}
		
}