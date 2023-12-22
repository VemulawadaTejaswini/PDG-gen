import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stn = "";
		
		while(sc.hasNext()){
			String s = sc.next();
			if(stn.length()!=0)stn += " ";
			if(s.length()>4){
				if(s.substring(0,5).compareTo("apple")==0){
					stn += "peach" + s.substring(5,s.length());
				}else if(s.substring(0,5).compareTo("peach")==0){
					stn += "apple" + s.substring(5,s.length());
				}else{
					stn += s;
				}
			}else{
				stn += s;
			}
		}
		System.out.println(stn);
	}
}