import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str = new String();
		while(in.hasNext()){
			String line = in.nextLine();
			String[] Array = line.split(" ");
			int a = Integer.parseInt(Array[0]);
			int b = Integer.parseInt(Array[1]);
			if((a+b)==0){
				break;
			}
			if(a>b){
				System.out.println(b+" "+a);
			}else if(a<b){
				System.out.println(a+" "+b);
			}else{
				System.out.println(a+" "+b);
			}
		}
	}
}