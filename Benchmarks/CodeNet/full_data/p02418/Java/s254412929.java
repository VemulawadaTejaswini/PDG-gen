import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		String s,p,temp;
		boolean match = false;
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	s = br.readLine();
    	p = br.readLine();
    	br.close();

    	s = s + s;
    	for(int i = 0;i < s.length()/2;i++){
    		temp = s.substring(i, i + p.length());
    		if(temp.equals(p)){
    			match = true;
    		}
    	}
    	if(match){
    		System.out.println("Yes");
    	}
    	else{
    		System.out.println("No");
    	}
    }
}