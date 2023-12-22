import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public void maain(){

	}

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????

		//1???????????\????????¢
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String n = br.readLine();



        //2???????????\????????¢
        String[] input2 = br.readLine().split(" ");

        //???????????????
        int[] num = new int[Integer.parseInt(n)];

        for(int set = 0; set < num.length; set++){
        	num[set] = Integer.parseInt(input2[set]);
        }




        for(int set3 = 0; set3 < num.length; set3++){
        	System.out.println(Arrays.toString(num));
        	for(int set = 0; set < num.length - 1; set++){
            	for(int set2 = set + 1; set2 < num.length; set2++){
            		if(num[set2] > num[set]){
            			int sort = num[set2];
            			num[set2] = num[set];
            			num[set] = sort;
            		}
            	}
            }
        }
	}
}