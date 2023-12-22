import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public void Sort(){

	}

	public void maain(){

	}

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????

		//1???????????\????????¢
	       StringBuilder buider = new StringBuilder();

	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int count = 0;
        int w = 0;

        //??\????????¢
        int[] LaunderingNum = new int[Integer.parseInt(n)];

        String[] input2 = br.readLine().split(" ");

        for(int i = 0; i < LaunderingNum.length; i++){
        	LaunderingNum[i] = Integer.parseInt(input2[i]);
        }

        //
        for(int i = 0; i < LaunderingNum.length - 1; i++){
        	
        	int minj = i;
        	
        	for(int j = i + 1; j < LaunderingNum.length; j++){
        		
        		if(LaunderingNum[j] < LaunderingNum[minj]){
        			minj = j;
        		}
        	}
        	if(minj != i){
        		
    			w = LaunderingNum[i];
    			LaunderingNum[i] = LaunderingNum[minj];
    			LaunderingNum[minj] = w;
    			count++;
        	}

        }
        //
        for(int i = 0; i < LaunderingNum.length; i++){

        	if(i == LaunderingNum.length - 1){
        		System.out.println(LaunderingNum[i]);
        	}else{
            	System.out.print(LaunderingNum[i] + " ");
        	}

        }
        System.out.println(count);
	}
}