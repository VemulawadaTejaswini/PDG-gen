import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		ArrayList<String> ary = new ArrayList<String>();
		int x,y;
		String op;
		String tmp;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		op = sc.next();
		y = sc.nextInt();
		tmp = ArrayAdder(x,y,op);
		ary.add(tmp);
		cnt++;

		while(!tmp.equals("end")){
			sc.hasNext();
			x = sc.nextInt();
			op = sc.next();
			y = sc.nextInt();
			tmp = ArrayAdder(x,y,op);
			ary.add(tmp);
			cnt++;
		}

		for(int i=0;i<cnt-1;i++){
			System.out.println(ary.get(i));
		}
		sc.close();
	}

	public static String ArrayAdder(int x,int y,String op){
		String result = "";
		if(op.equals("+")){
			result = "" + (x + y);
		}else if(op.equals("-")){
			result = "" + (x - y);
		}else if(op.equals("*")){
			result = "" + (x * y);
		}else if(op.equals("/")){
			result = "" + (x / y);
		}else if(op.equals("?")){
			result = "end";
		}else if(x==0 && y==0){
			result = "end";
		}
		return result;
	}

}