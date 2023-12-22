import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????
		int a, b;
		int ans = 0;
		//String str[];
		String op = "";

		/*while(!op.equals("?")){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        str = br.readLine().split(" ");*/
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
	        a = scan.nextInt();
	        op = scan.next();
	        b = scan.nextInt();

	        switch(op){
		        case "+":
		        	ans = a + b;
		        	break;
		        case "-":
		        	ans = a - b;
		        	break;
		        case "*":
		        	ans = a * b;
		        	break;
		        case "/":
		        	ans = a / b;
		        	break;
	        }
	        if (!op.equals("?")) System.out.println(ans);
	        else break;

		}

	}

}