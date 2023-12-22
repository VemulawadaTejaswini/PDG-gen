import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baseball_Simulation {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		boolean[] arg = null;
		int length=0,out=0;
        int i=0;
        boolean first=true;
        int[] score=null;
        boolean[] rui=new boolean[3];
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	
            	if(first){
            		length=Integer.parseInt(line);
            		score=new int[length];
            		first=false;
            	}else{
            		if(line=="OUT"){
            			out++;
            		}else if(line=="HIT"){
            			if(rui[2]){
            				score[i]++;
            				rui[2]=false;
            			}
            			if(rui[1]){
            				rui[2]=true;
            				rui[1]=false;
            			}
            			if(rui[0]){
            				rui[1]=true;
            			}
            			rui[0]=true;
            		}else if(line=="HOMERUN"){
            			score[i]++;
            			for(int j=0;j<3;j++){
            				if(rui[j]){
            					score[i]++;
            				}
            			}

            		}
            	}
            	if(out==3){
            		rui=new boolean[3];
            		i++;
            		if(length==i){
            			break;
            		}
            	}

            }
            for(int k=0;k<score.length;k++){
            	System.out.println(score[k]);
            }
		}
	}
}