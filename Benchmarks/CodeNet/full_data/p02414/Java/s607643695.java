import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,n=0,m=0,l=0;
            int[][] a=null,b=null;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	if(first){
            		n=Integer.parseInt(str[0]);
            		m=Integer.parseInt(str[1]);
            		l=Integer.parseInt(str[2]);
            		a=new int[n][m];
            		b=new int[m][l];
            		i=0;
            		first=false;
            	}else{
            		if(i<n){
            			for(int j=0;j<str.length;j++){
            				a[i][j]=Integer.parseInt(str[j]);
            			}
            		}else{
            			for(int j=0;j<str.length;j++){
            				b[i-n][j]=Integer.parseInt(str[j]);
            			}
            		}
            		i++;
            		if(i==n+m){
            			String[] s=new String[l];
            			for(int j=0;j<n;j++){
            				for(int k=0;k<l;k++){
            					long sum=0;
                				for(int o=0;o<m;o++){
                					sum+=(a[j][o]*b[o][k]);
                				}
                				
                				s[k]=String.valueOf(sum);
                			}
            				System.out.println(String.join(" ", s));
            			}
            			break;
            		}
            	}
            }
        }
    }

}