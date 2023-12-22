import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s;
	int rst = 0;
	while((s=br.readLine()) != null){
	    boolean flg = true;
	    for(int i=0,j=s.length()-1; i!=j && i!=j+1; i++,j--){
		if(s.charAt(i) != s.charAt(j)){
		    flg = false;
		    break;
		}
	    }
	    if(flg) rst++;
	}
	System.out.println(rst);
    }
}