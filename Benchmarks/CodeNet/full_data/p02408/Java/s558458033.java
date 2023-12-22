import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String[] arr;
        int n=0;
        boolean [][] card = new boolean[4][13];
         
        while((str=br.readLine())!=null){
            if(n==0){
                n=Integer.parseInt(str);
                continue;
            }
 
            for(int i=0;i<=n;i++){
            	arr=str.split(" ");
            	if(arr[0]=="S"){
            		card[0][Integer.parseInt(arr[1])] = true;
            	} else if(arr[0]=="H"){
            		card[1][Integer.parseInt(arr[1])] = true;
            	} else if(arr[0]=="C"){
            		card[2][Integer.parseInt(arr[1])] = true;
            	} else {
            		card[3][Integer.parseInt(arr[1])] = true;
            	}
            }
            
            for(int i=0;i<4;i++){
            	for(int j=0;j<13;j++){
            		if(card[i][j]){
            			continue;
            		}else{
            			System.out.println(p(i) + " " + j);
            		}
            		
            	}
            }
            break;
        }
        System.out.println("");
        br.close();
    }
    public static String p(int num) {
    	switch(num){
    	case 0:
    		return "S";
		case 1:
    		return "H";
    	case 2:
    		return "C";
    	default:
    		return "K";
    	}
    }
}