import java.util.Scanner;

class Main{
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	String ipot;
	

	while(true){
	ipot=s.nextLine();
		
		if("0 0".equals(ipot)){
		break;
		}
		
		System.out.println(cop(ipot));
	
	}
	}
	private static String cop(String ipot){
	String space=" ";
	String nums[]=ipot.split(space);
		
		Long x= Long.parseLong(nums[0]);
		Long y= Long.parseLong(nums[1]);
		
		if(x>y){
		
		return (y+space+x);
		
		}
		return (x+space+y);
	}
	
	
}
