import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int i=0,data;
		String indata;
		while(true){
			indata = s.next();
			data=Integer.parseInt(indata);
			if(data==0)break;
			i++;
			System.out.println("Case "+i+": "+data);
		}
	}
}