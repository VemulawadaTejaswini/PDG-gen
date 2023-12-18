import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args) throws Exception {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        String boxstr[] = line.split(" ");
        int[] box = new int[2];
        box[0] = Integer.parseInt(boxstr[0]);
        box[1] = Integer.parseInt(boxstr[1])/1000;
        
        int[] gift = {-1,-1,-1};
        
        
        
      outside: for(int i=box[0];i+1>0;i--){
       // 	System.out.println("Hi" + i);
        	if(i*10==box[1]){
        		gift[0] =i;
        		gift[1] =0;
        		gift[2] =0;
        		break outside;

        	}else if(i*10 <box[1]){
            //	System.out.println("Change" + i);
            	for(int j=box[0]-i;j+1>0;j--){
              //  	System.out.println("Hii" + j);
                	if(i*10+j*5==box[1]){
                		gift[0]=i;
                		gift[1] =j;
                		gift[2] =0;
                		break outside;
                		
                	}else if(i*10+j*5 <box[1]){
                    //	System.out.println("Change" + i);
                    	for(int h=box[0]-i-j;h+1>0;h--){
                     // 	System.out.println("Hee" + h);
                        	if(i*10+j*5+h==box[1]){
                        		gift[0]=i;
                        		gift[1] =j;
                        		gift[2] =h;
                        		
                        		break outside;
                    	}
                	}
                	}
        		
        	}
        }
        
        
        
        
        
           }
        for(int i=0;i<3;i++){
        	System.out.print(gift[i]+" ");
        }
        
        
        
        


	}
	}
	

	