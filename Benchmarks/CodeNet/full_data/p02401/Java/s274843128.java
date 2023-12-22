
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputData;
        List<Integer> resultList = new ArrayList<Integer>();
        try {

	        while(true){
					inputData = reader.readLine();
	            if(inputData.indexOf(" ? ") > 0){
	            	break;
	            }else{
					String[] strNumber = inputData.split(" ");
					int a = Integer.parseInt(strNumber[0]);
					String op = strNumber[1];
					int b = Integer.parseInt(strNumber[2]);

					resultList.add(outputCalc(a , b, op));

	            }
	        }
	        for(Integer val: resultList){
	        	System.out.println(val);
	        }

		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}

	}
	/**
	 * ?????????????????????
	 * @param a
	 * @param b
	 * @param op
	 * @return result
	 */
	private static Integer outputCalc(int a , int b , String op){

		int result = 0;
		if("+".equals(op)){
			result = a + b;
		}else if("-".equals(op)){
			result = a - b;
		}else if("*".equals(op)){
			result = a * b;
		}else if("/".equals(op)){
			result = a / b;
		}
		return result;
	}


}