import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            line=br.readLine();
            String[] x=line.split(" ");
            int a=Integer.parseInt(x[0]);
            int b=Integer.parseInt(x[1]);
            int store=0;
            for(int i=1;i<Integer.min(a, b)+1;i++){
            	if(a%i==0&&b%i==0){
            		store=i;
            	}
            }
            System.out.println(store);
        }
	}

}