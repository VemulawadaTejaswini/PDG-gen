import java.util.*;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n;
		Ice ice;
		
		while(true){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			ice = new Ice();
			for(int i=0;i<n;i++){
				ice.sellIce(scan.nextInt());
			}
			
			for(int i=0;i<10;i++){
				System.out.println(ice.show(i));
			}
		}
	}
}

class Ice{
	HashMap<Integer,Integer> sales = new HashMap<Integer,Integer>();
	
	Ice(){
		for(int i=0;i<10;i++){
			sales.put(i,0);
		}
	}
	
	public String show(int num){
		int n = sales.get(num);
		String str = "";
		if(n == 0){
			return "-";
		}
		
		for(int i=0;i<n;i++){
			str += "*";
		}
		return str;
	}
	
	public void sellIce(int num){
		sales.put(num,sales.get(num)+1);
	}
}