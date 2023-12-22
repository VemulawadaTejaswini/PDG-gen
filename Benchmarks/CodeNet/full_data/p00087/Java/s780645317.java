	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Stack;
	 
	public class Main {
	    public static void main(String[] args) {
	        List<String> inputDataList = new LinkedList<String>();
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String input = null;
	        try {
	            while ((input = in.readLine()) != null) {
	                inputDataList.add(input);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                in.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	 
	        for (String inputData : inputDataList) {
	            double result = cast(inputData.split(" "));
	            System.out.println(result);
	        }
	    }
	    private static double cast(String[] formula) {
	 
	        Stack<Double> stack = new Stack<Double>();
	        double num1;
	        double num2; 
	        for (String data : formula) {
	
	            if ("+".equals(data)) { 
	                num2 = stack.pop().doubleValue();
	                num1 = stack.pop().doubleValue();
	                stack.push(new Double(num1 + num2));
	            } else if ("-".equals(data)) {
	                num2 = stack.pop().doubleValue();
	                num1 = stack.pop().doubleValue();
	                stack.push(new Double(num1 - num2));
	            } else if ("*".equals(data)) {
	                num2 = stack.pop().doubleValue();
	                num1 = stack.pop().doubleValue();
	                stack.push(new Double(num1 * num2));
	            } else if ("/".equals(data)) {
	                num2 = stack.pop().doubleValue();
	                num1 = stack.pop().doubleValue();
	                stack.push(new Double(num1 / num2));
	 
	            } else {
	 
	                stack.push(Double.parseDouble(data));
	 
	            }
	        }
	 
	        return stack.pop().doubleValue();
	    }
	}