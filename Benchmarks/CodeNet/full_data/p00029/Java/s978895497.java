import java.util.*;

class Cnt {
	
	public int    number = 0;
	public String ward   = null;
	
	Cnt(String s){this.ward = s;}
}

public class Main {
	
	private static ArrayList<Cnt> list = new ArrayList<Cnt>();
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
		String[] wards = sc.next().split("\\s");
		
		
		boolean find_flg;
		int max = 0;
		String max_ward = "";
		for(String s:wards){

			//Frequency of appearance is investigated.
			Cnt c = null;
			find_flg = false;
			for(int i=0;i<list.size();i++){
				c = list.get(i);
				if(c.ward.equals(s)){
					c.number++;
					find_flg = true;
					break;
				}
			}
			if(!find_flg){list.add(new Cnt(s));}
			
			//The number of characters is counted.
			if(s.length() > max){
				max = s.length();
				max_ward = s; 
			}
		}
		
		//calculate frequency of appearance.
		int freq_max = 0;
		String freq_ward = "";
		for(Cnt c:list){
			if(c.number > freq_max){
				freq_max  = c.number;
				freq_ward = c.ward;
			}
		}

		//output
		System.out.println(freq_ward + " " + max_ward);
	}
}