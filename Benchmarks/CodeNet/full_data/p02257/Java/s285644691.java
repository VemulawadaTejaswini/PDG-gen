import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static int prime(int a){
		if(a==2||a==3)return 1;
		for(int i=2;i<Math.sqrt(a)+1;i++){
			if(a%i==0){
				return 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0,j=0,store=0;
            boolean first=true;
            while ((line = br.readLine()) != null) {
            	if(first){
            		n=Integer.parseInt(line);
            		first=false;
            	}else{
            		store+=prime(Integer.parseInt(line));
            		j++;
            		if(j==n){
            			break;
            		}
            	}           	
            }
            System.out.println(store);
        }
	}

}