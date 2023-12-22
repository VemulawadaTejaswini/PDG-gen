import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int num1 = Integer.parseInt(line[0]);
        int num2 = Integer.parseInt(line[1]);
        ArrayList<Integer> aryNum = new ArrayList<Integer>();
        int[] totalCol = new int[num2];

        for(int i = 0; i < num1; i++){
        	String[] input = br.readLine().split(" ");
        	int total = 0;
        	for(int j = 0; j < num2; j++){
        		total += Integer.parseInt(input[j]);
        		aryNum.add(Integer.parseInt(input[j]));
        		totalCol[j] += Integer.parseInt(input[j]);
        	}
        	aryNum.add(total);
        }

        int count = 1;
        int lastTotal = 0;
        for(int num : aryNum){

        	System.out.print(num);
        	if(count % (num2 + 1) == 0){
        		lastTotal += num;
        		System.out.println();
        	}else{
        		System.out.print(" ");
        	}
        	count++;
        }

        for(int num : totalCol){
        	System.out.print(num + " ");
        }
        System.out.println(lastTotal);

    }
}