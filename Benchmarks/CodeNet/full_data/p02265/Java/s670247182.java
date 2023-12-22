import java.util.Scanner;
import java.util.ArrayList;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = 0;
		String meirei;
		StringBuilder answer = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<Integer>();
			
		int i;
		int size;
			
		for(i = 0; i < n; i++){
			 meirei = scan.next();
			 size = list.size();
			 switch(meirei){
			 	case "deleteFirst":
			 		list.remove(size - 1);
			 		break;
			 		
			 	case "deleteLast":
			 		list.remove(0);
			 		break;
			 		
			 	case "insert":
			 		m = scan.nextInt();
			 		list.add(m);
			 		break;
			 		
			 	case "delete":
			 		m = scan.nextInt();
			 		for(int j = size - 1; j >= 0; j--){
						if(m == list.get(j)){
							list.remove(j);
							break;
						}
					}
			 		break;
			 }
		}
		
		size = list.size();
		answer.append(String.valueOf(list.get(size - 1)));
		for(i = size - 2; i >= 0; i--){
			answer.append(" ").append(list.get(i)); 
		}
		System.out.println(answer);
	}
}