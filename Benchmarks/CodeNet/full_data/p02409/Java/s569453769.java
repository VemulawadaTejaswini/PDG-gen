import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public void maain(){

	}

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		//???????????£?¨?
		int building [][][] = new int [4][3][10];

		//?????????????????????????????\??????
    	for(int b_building = 0; b_building < 4; b_building++){
    		for(int stairs = 0; stairs < 3; stairs++){
    			for(int num = 0; num < 10; num++){
    				building[b_building][stairs][num] = 0;
    			}
    		}
    	}

		//1???????????\????????¢
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);

        //v??????????????\??????
        for(int set = 0;set < n; set++){
        	String[] input2 = br.readLine().split(" ");
        		int b = Integer.parseInt(input2[0]);
        		int f = Integer.parseInt(input2[1]);
        		int r = Integer.parseInt(input2[2]);
        		int v = Integer.parseInt(input2[3]);
        		building[b - 1][f - 1][r - 1] = building[b - 1][f - 1][r - 1] + v;
        }

		//?????¢?????¨?????????
    	for(int b_building = 0; b_building < 4; b_building++){
    		for(int stairs = 0; stairs < 3; stairs++){
    			for(int num = 0; num < 10; num++){
    				System.out.print(" ");
    				System.out.print(building[b_building][stairs][num]);
    			}
    			System.out.println();
    		}
    		if(b_building == 3){
    		}else{
    			System.out.println("####################");
    		}
    	}
	}
}