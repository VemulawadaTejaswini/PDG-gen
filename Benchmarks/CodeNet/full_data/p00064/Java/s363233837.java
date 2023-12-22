import java.util.*;
public class Main {
	static boolean isNumber(char val){
		try{
			Integer.parseInt(val+"");
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
	static int henkan(String n){
		return Integer.parseInt(n);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int sum=0;
		while(in.hasNext()){
			String input = in.nextLine();
			String memo="";
			boolean sw = false;
			for(int s=0;s<input.length();s++){
				if(isNumber(input.charAt(s))){
					memo+=input.charAt(s);
					sw=true;
				}else if(sw){
					sw=false;
					sum+=henkan(memo);
					memo="";
				}else{
					sw=false;
					memo="";
				}
			}
			if(sw)sum+=henkan(memo);
		}
		System.out.println(sum);
	}
}