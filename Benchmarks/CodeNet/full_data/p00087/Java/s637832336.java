import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] stack = new double[40];
		while(scan.hasNext()){
			int sp = 0;
			String[] str = scan.nextLine().split(" ");
			for(int i = 0;i < str.length;i++){
				if(str[i].equals("+")){
					double a = stack[--sp];
					double b = stack[--sp];
					stack[sp++] = a + b;
				}else if(str[i].equals("-")){
					double a = stack[--sp];
					double b = stack[--sp];
					stack[sp++] = b - a;
				}else if(str[i].equals("*")){
					double a = stack[--sp];
					double b = stack[--sp];
					stack[sp++] = a * b;
				}else if(str[i].equals("/")){
					double a = stack[--sp];
					double b = stack[--sp];
					stack[sp++] = b / a;
				}else{
					stack[sp++] = Double.parseDouble(str[i]);
				}
			}
			for(int i = 0;i < sp;i++){
				System.out.printf("%.6f\n",stack[i]);
			}
		}
	}
}