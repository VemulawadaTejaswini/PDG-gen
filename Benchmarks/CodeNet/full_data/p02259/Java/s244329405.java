import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        int yard = 0;

        //
        int[] num = new int[Integer.parseInt(n)];

        String[] input2 = br.readLine().split(" ");

        for(int i = 0; i < num.length; i++){
        	num[i] = Integer.parseInt(input2[i]);
        }

        //
        for(int i = 0; i < num.length - 1; i++){

        	for(int j = i + 1; j < num.length; j++){

        		if(num[i] > num[j]){
        			yard = num[i];
        			num[i] = num[j];
        			num[j] = yard;
        			count++;
        		}
        	}
        }

        //
        for(int i = 0; i < num.length; i++){

        	if(i == num.length - 1){
        		System.out.println(num[i]);
        		System.out.println(count);
        	}else{
            	System.out.print(num[i] + " ");
        	}
        }
	}
}