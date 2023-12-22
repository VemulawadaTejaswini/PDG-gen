import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,n=0,m=0;
            int[][] card=null;
            int[] mat=null;
            while ((line = br.readLine()) != null) {
            	if(first){
            		String[] str=line.split(" ");
            		n=Integer.parseInt(str[0]);
            		m=Integer.parseInt(str[1]);
            		card=new int[n][m];
            		mat=new int[m];
            		first=false;
            	}else{
            		if(i<n){
            		String[] str=line.split(" ");
            		for(int j=0;j<m;j++){
            			card[i][j]=Integer.parseInt(str[j]);
            		}
            		i++;
            		}else{
            			mat[i-n]=Integer.parseInt(line);
            			i++;
	            		if(i==n+m){
	            			for(int j=0;j<n;j++){
	            				int sum=0;
	            				for(int l=0;l<m;l++){
	            					sum+=(mat[l]*card[j][l]);
	            				}
	            				System.out.println(sum);
	            			}
	            			break;
	            		}
            		}
            	}
            }
        }
    }

}