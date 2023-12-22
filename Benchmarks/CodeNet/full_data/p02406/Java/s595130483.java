import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0,s=0,sum=0;
            boolean end=false;
            while ((line = br.readLine()) != null) {
            	n=Integer.parseInt(line);
            	for(int i=1;i<n+1;i++){
            		int x=i;
            		while(true){
            			if(x%10==3){
            				System.out.print(" "+i);
            				break;
            			}else if(i%3==0){
                			System.out.print(" "+i);
                			break;
                		}
            			x/=10;
            			if(x==0)break;
            		}
            	}
            	System.out.println();
            	break;
            }
        }
    }

}