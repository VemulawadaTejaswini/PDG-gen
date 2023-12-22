import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Main app = new Main();
		int count=0;
		
		while(scan.hasNext()){
			String str = scan.nextLine();
			String rts = app.reverse(str);
			count += app.checkStr(str,rts);
		}
		System.out.println(count);
	}
	
	public String reverse(String str){
		StringBuffer sb = new StringBuffer(str);
		String rts = sb.reverse().toString();
		
		return rts;
	}
	
	public int checkStr(String str,String rts){
		if(str.equals(rts)){
			return 1;
		}
		
		return 0;
	}
}