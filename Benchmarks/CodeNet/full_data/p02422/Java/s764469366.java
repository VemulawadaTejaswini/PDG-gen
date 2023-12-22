import java.io.*;
 
class Main {
    	public static void main(String[] args) throws IOException {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	String str1; 
		String str2 = br.readLine();
        	int a, b;
		int num = Integer.parseInt(br.readLine());
       		StringBuffer sb1 = new StringBuffer(str2);
        	for (int i = 0; i < num; i++) {
            		String[] order = br.readLine().split(" ");
            		a = Integer.parseInt(order[1]);
            		b = Integer.parseInt(order[2]);
            		if (order[0].equals("print")) {
                		System.out.println(str2.substring(a, b + 1));
            		}else if (order[0].equals("reverse")) {
                		StringBuffer sb2 = new StringBuffer(str2.substring(a, b + 1));
                		str1 = sb2.reverse().toString();
                		str2 = sb1.replace(a, b + 1, str1).toString();
            		}else if (order[0].equals("replace")) {
                		str2 = sb1.replace(a, b + 1, order[3]).toString();
            		}
        	}
    	}
}