import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            boolean first=true;
            int[] N=null,M=null;
            int[] vote=null;
            int n=0,m=0,i=0;
            while ((line = br.readLine()) != null) {
            	if(first){
            		String[] tokens=line.split(" ");
            		n=Integer.parseInt(tokens[0]);
            		m=Integer.parseInt(tokens[1]);
            		N=new int[n];
            		vote=new int[n];
            		M=new int[m];
            		first=false;
            	}else{
            		if(n>i){
            			N[i]=Integer.parseInt(line);
            		}else{
            			M[i-n]=Integer.parseInt(line);
            		}
            		i++;
            		if(n+m==i){
            			break;
            		}
            	}
            }
            for(int j=0;j<m;j++){
            	for(int k=0;k<n;k++){
                	if(M[j]>=N[k]){
                		vote[k]++;
                		break;
                	}
                }
            }
            int max=0,store=0;
            for(int k=0;k<n;k++){
            	if(max<vote[k]){
            		max=vote[k];
            		store=k;
            	}
            }
            System.out.println(store+1);
        }
    }

}