import java.io.*;

public class max {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine( );
        String[] stringLine = line.split("\n");
        int k = stringLine.length;
        String[] stringArrayN = new String[k-1];
        String[] stringArrayX = new String[k-1];
        int[] numArrayN = new int[k-1];
        int[] numArrayX = new int[k-1];
        int count = 0;
        for(int j=0;j<k-1;j++){
        	stringArrayN[j] = stringLine[j].split(" ")[0];
        	stringArrayN[j] = stringLine[j].split(" ")[1];
        	numArrayN[j] = Integer.parseInt(stringArrayN[j]);
        	numArrayX[j] = Integer.parseInt(stringArrayX[j]);
        	for(int s=0;s<numArrayN[j];s++){
        		for(int t=0;t<numArrayN[j];t++){
        			for(int u=0;u<numArrayN[j];u++){
        				if(s+t+u==numArrayX[j] && s!=t && t!=u && u!=s){
        					count++;
        				}
        			}
        		}
        	}
        	System.out.println(count);
        }
	}

}