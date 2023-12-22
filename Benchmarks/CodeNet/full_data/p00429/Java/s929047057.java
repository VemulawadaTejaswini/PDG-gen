import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        int state=0,move=0;
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line,store;
            while ((line = br.readLine()) != null) {
            	if(line.equals("0"))break;
            	if(state==0){
            		move=Integer.parseInt(line);
            		state=1;
            	}else if(state==1){
            		store=line;
            		String result=store;
            		while(move>0){
            			int store_String=0;            			
            			store=result;
            			String pre=store.substring(0, 1);
            			result="";
            			boolean last=false;
            			for(int j=0;j<store.length();j++){
            				if(pre.equals(store.substring(j,j+1))){
            					store_String++;
            					pre=store.substring(j,j+1);
            					if(j==store.length()-1){
            						last=true;
            					}
            				}else{
            					result+=(String.valueOf(store_String)+pre);
            					pre=store.substring(j,j+1);
            					store_String=1;
            					if(j==store.length()-1){
            						result+=(String.valueOf(store_String)+store.substring(j,j+1));
            					}
            				}
            			}
            			if(last){
        					result+=(String.valueOf(store_String)+pre);
        				}
            			move--;
            		}
            		state=0;
            		System.out.println(result);
            	}                
            }
        }
    }

}