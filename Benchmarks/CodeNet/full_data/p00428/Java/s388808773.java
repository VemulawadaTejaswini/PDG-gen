import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        boolean[] arg = null;
        int[] states=null;
        int kouho=0,member=0;
        int i=0;
        //int state=0;
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	String[] tokens = line.split(" ");
                if(tokens.length==2){
                    member=Integer.parseInt(tokens[0]);
                    kouho=Integer.parseInt(tokens[1]);
                    states=new int[kouho];
                    if(member==0&&kouho==0)break;
                    i=0;
                }else{
                    for(int k=0;k<kouho;k++){
                    	states[k]+=Integer.parseInt(tokens[k]);
                    }
                    i++;
                    if(i==member){
                    	int[] score=new int[kouho];
                    	int count=0;
                    	for(int l=member;-1<l;l--){
                    		for(int j=0;j<kouho;j++){
                    			if(states[j]==l){
                    				score[count]=j+1;
                    				count++;
                    			}
                    			if(count==kouho){
                        			break;
                        		}
                    		}
                    		if(count==kouho){
                    			break;
                    		}
                    	}
                    	String[] str=new String[kouho];
                    	for(int l=0;l<kouho;l++){
                    		str[l]=Integer.toString(score[l]);
                    	}
                    	System.out.print(String.join(" ", str));
                    	System.out.println();
                    }
                }
            }
        }
    }

}