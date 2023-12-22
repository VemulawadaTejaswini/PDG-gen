import java.util.*;

class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<String> str= new ArrayList<String>();
		while(sc.hasNextLine()){
			str.add(sc.nextLine());
		}
		for(int i=0; i<str.size();i++){
			if(Integer.parseInt(str.get(i))==0){
				break;
			}
			System.out.println("Case "+(i+1)+": "+str.get(i));
		}
	}
}