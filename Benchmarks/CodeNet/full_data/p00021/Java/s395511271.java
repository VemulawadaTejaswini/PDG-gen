import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //1???????????????????????????????????°???????????????
        String str = br.readLine();
        //???????????????????????????????????????????????????
        int calcCnt = Integer.parseInt(str);
        
        for(int i = 0; i < calcCnt; i++){
        	String data = br.readLine();
        	String[] strZahyo;
        	strZahyo = data.split(" ");
        	double[] zahyo = new double[strZahyo.length];
        	for(int j = 0; j < strZahyo.length; j++){
        		zahyo[j] = Double.parseDouble(strZahyo[j]); 
        	}
        	double slope1, slope2;
            slope1 = (zahyo[3]-zahyo[1])/(zahyo[2]-zahyo[0]);
            slope2 = (zahyo[6]-zahyo[4])/(zahyo[5]-zahyo[3]);
            
            if(slope1 == slope2)System.out.println("YES");
            else System.out.println("NO");
            
        }
        
	}

}