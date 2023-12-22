import java.io.*;

class Main {
    public static void main(String[] args) {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	try{
			int a = 0;
			String op = "";
			int b = 0;
			boolean end = false;
			
			while(end == false){
				String[] tmp = br.readLine().split(" ");
				a = Integer.parseInt(tmp[0]);
				op = tmp[1];
				b = Integer.parseInt(tmp[2]);
				
				if(a < 0 && b > 20000 || (b == 0 && op.equals("/"))){
					op = "?";
				}
				switch(op){
				case "+":
					System.out.println(a+b);
					break;
				case "-":
					System.out.println(a-b);
					break;
				case "*":
					System.out.println(a*b);
					break;
				case "/":
					System.out.println(a/b);
					break;
				case "?":
					end = true;
					break;
				default:
					
				}
			}
			
        } catch (Exception e) {
            System.out.println(e);
        }
    	
    }
}