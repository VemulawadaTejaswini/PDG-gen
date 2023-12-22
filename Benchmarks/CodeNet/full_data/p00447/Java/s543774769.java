import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,len1=0,len2=0;
            int state=0;
            int[] x1 = null,y1 = null;
            int[] x2=null,y2=null;
            
            while ((line = br.readLine()) != null) {
            	
            	if(line.equals("0"))break;
            	if(state==0){
            		len1=Integer.parseInt(line);
            		state=1;
            		i=0;
            		x1=new int[len1];
            		y1=new int[len1];
            	}else if(state==2){
            		len2=Integer.parseInt(line);
            		state=3;
            		i=0;
            		x2=new int[len2];
            		y2=new int[len2];
            	}else if(state==1){
            		String[] str=line.split(" ");
            		x1[i]=Integer.parseInt(str[0]);
            		y1[i]=Integer.parseInt(str[1]);
            		i++;
            		if(i==len1){
            			state=2;
            		}
            	}else if(state==3){
            		String[] str=line.split(" ");
            		x2[i]=Integer.parseInt(str[0]);
            		y2[i]=Integer.parseInt(str[1]);
            		i++;
            		if(i==len2){
	            		int x=x1[0],y=y1[0];
	            		int[] xmove=new int[len2];
	            		int[] ymove=new int[len2];
	            		int pit=0,storex=0,storey=0;
	            		for(int j=0;j<len2;j++){
	            			xmove[j]=x2[j]-x;
	            			ymove[j]=y2[j]-y;
	            		}
	            		for(int j=1;j<len2;j++){
	            			pit=0;
	            			for(int k=0;k<len1;k++){
	            				for(int l=0;l<len2;l++){
		            				if(x2[l]==(x1[k]+xmove[j])&&y2[l]==(y1[k]+ymove[j])){
		            					pit++;
		            				}
		            				if(pit==len1){
		            					storex=xmove[j];
		            					storey=ymove[j];
		            					break;
		            				}
		            			}
	            			}
	            			if(pit==len1-1){
	        					break;
	        				}
	            		}
	            		System.out.println(storex+" "+storey);
	            		state=0;
            		}
            	}
            }
        }
    }

}