import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	int[] numArray = strToInt(str.split("\\s"));
    	int result;

    	if(numArray[0] > numArray[1]){
			result = getGCD(numArray[0],numArray[1]);
    	}else{
			result = getGCD(numArray[1],numArray[0]);
    	}

        System.out.println(result);
    }
    public static int getGCD(int x,int y){
    	int temp;
    	while((temp = x % y) != 0){
    		x = y;
    		y = temp;
    	}
    	return y;
    }
    public static int[] strToInt(String[] strArray){
    	int[] numArray = new int[strArray.length];
    	for(int i=0; i<strArray.length; i++){
    		numArray[i] = Integer.parseInt(strArray[i]);
    	}
    	return numArray;
    }
}