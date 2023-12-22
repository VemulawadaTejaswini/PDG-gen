import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int n=0,result=-10000000;
            int[] store=null;
            boolean min_flag=true;
            while ((line = br.readLine()) != null) {
            	n=Integer.parseInt(line);
            	store=new int[n];
            	int s=0;
            	int min=Integer.parseInt(br.readLine()),max=min;
            	for(int i=1;i<n;i++){
            		if(min_flag){
            			s=Integer.parseInt(br.readLine());
            		}
            		//System.out.println(s);
            		min_flag=true;
            		if(s<=min&&i!=n-1){
            			//System.out.println(s);
            			min=s;
	            		if(i==n-2){
	            			max=Integer.parseInt(br.readLine());
	            			if(max-min>result){
	            				System.out.println(max-min);
	            			}else{
	           					System.out.println(result);
	            			}
	            			return;
	            		}else{
	            			s=Integer.parseInt(br.readLine());
	            			//System.out.println("AA");
	            			max=s;
	            			if(result<max-min){
	            				result=max-min;
	            			}else{
	            				min_flag=false;
	            			}
	            			i++;
	            		}
	            	}else if(s>=max){
	            		
	           			max=s;
	            		if(max-min>result){
	            			result=max-min;
	            		}
	           		}
            		
            	}
            	
            	System.out.println(result);
            	break;
            }
        }
    }

}