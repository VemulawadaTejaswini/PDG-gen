import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0041().doIt();
	}
	
	class AOJ0041{
		char[] op;
		char[] hyou;
		void doIt(){
			hyou = new char[3];
			hyou[0] = '+';
			hyou[1] = '-';
			hyou[2] = '*';
			op = new char[4];
			int num[] = new int[4];
			while(true){
				num[0] = in.nextInt();
				num[1] = in.nextInt();
				num[2] = in.nextInt();
				num[3] = in.nextInt();
				int sum = num[0]+num[1]+num[2]+num[3];
				if(sum == 0)return;				
				boolean sw = false;
				for(int i=0;i<4;i++)for(int s=0;s<4;s++)for(int j=0;j<4;j++)for(int k=0;k<4;k++){
					if(i == s || i == j || i == k || s == j || s == k || j == k || sw)continue;
					int a = num[i];
					int b = num[s];
					int c = num[j];
					int d = num[k];
					if(patternA(a, b, c, d)){
//						System.out.println("A");
						System.out.println("((("+ a + " " + op[0] + " " + b + ")" + op[1] + " " + c + ")" + " " + op[2] + " " + d + ")");
						sw = true;
						break;
					}
					if(patternB(a, b, c, d)){
//						System.out.println("B");
						System.out.println("(("+ a + " " + op[0] + " (" + b + " " + op[1] + " " + c + "))" + " " + op[2] + " " + d + ")");
						sw = true;
						break;
					}
					if(patternC(a, b, c, d)){
//						System.out.println("C");
						System.out.println("("+ a + " " + op[0] + " " + b + ") " + op[1] + " (" + c  + " " + op[2] + " " + d + ")");
						sw = true;
						break;
					}
				}
				if(!sw)System.out.println("0");
//				System.out.println("END");
			}
		}
		
		boolean patternA(int a,int b,int c,int d){//(((a + b) + c) + d)
			for(int i=0;i<3;i++)for(int s=0;s<3;s++)for(int j=0;j<3;j++){
				int result = calc(calc(calc(a, b, i),c,s),d,j);
				if(result == 10){
					op = new char[3];
					op[0] = hyou[i];
					op[1] = hyou[s];
					op[2] = hyou[j];
					return true;
				}
			}
			return false;
		}
		
		boolean patternB(int a,int b,int c,int d){//((a + (b + c)) + d)
			for(int i=0;i<3;i++)for(int s=0;s<3;s++)for(int j=0;j<3;j++){
				int result = calc(calc(calc(b, c, i),a,s),d,j);
				if(result == 10){
					op[0] = hyou[i];
					op[1] = hyou[s];
					op[2] = hyou[j];
					return true;
				}
			}
			return false;
		}
		
		boolean patternC(int a,int b,int c,int d){//(a + b) + (c + d)
			for(int i=0;i<3;i++)for(int s=0;s<3;s++)for(int j=0;j<3;j++){
				int result = calc(calc(a, b, i),calc(c, d, j),s);
				if(result == 10){
					op[0] = hyou[i];
					op[1] = hyou[s];
					op[2] = hyou[j];
					return true;
				}
			}
			return false;
		}
		
		int calc(int a,int b,int op){
			if(op == 0)return a+b;
			else if(op == 1)return a-b;
			else return a*b;
		}
		
	}
	
}