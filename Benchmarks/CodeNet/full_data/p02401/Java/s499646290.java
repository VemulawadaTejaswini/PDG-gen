import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String op;
		String[] ArrayX = new String[3];
		int[] ArrayA = new int[2];
		int resultNum = 0;
		String resultLine = "";

        boolean check = true;
        while(check){
            String line = br.readLine();
            ArrayX = line.split(" ");
            op = ArrayX[1];
            ArrayA[0] = Integer.parseInt(ArrayX[0]);
            ArrayA[1] = Integer.parseInt(ArrayX[2]);
            
            if(op.equals("+")) {
            	resultNum = ArrayA[0] + ArrayA[1];
            	resultLine = resultLine + resultNum + ("\n");
            }
            else if(op.equals("-")) {
            	resultNum = ArrayA[0] - ArrayA[1];
            	resultLine = resultLine + resultNum+ ("\n");
            }
            else if(op.equals("*")) {
            	resultNum = ArrayA[0] * ArrayA[1];
            	resultLine = resultLine + resultNum+ ("\n");
            }
            else if(op.equals("/")) {
            	resultNum = (ArrayA[0] / ArrayA[1]);
            	resultLine = resultLine + resultNum+ ("\n");
            }
            
            else if(op.equals("?") ){
            	check = false;
            }
        }
        System.out.print(resultLine);
	}
}