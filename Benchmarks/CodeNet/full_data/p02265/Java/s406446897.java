import java.util.Scanner;
import java.util.ArrayList;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = 0;
		String meirei;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int i;
		int size;
		
		for(i = 0; i < n; i++){
			 meirei = scan.next();
			 size = list.size();
			 
			if(meirei.equals("deleteFirst")){
					list.remove(size - 1);
			}else if(meirei.equals("deleteLast")){
					list.remove(0);
			}else if(meirei.equals("insert") || meirei.equals("delete")){
				m = scan.nextInt();
				if(meirei.equals("insert")){
					list.add(m);
				}else{
					for(int j = size - 1; j >= 0; j--){
						if(m == list.get(j)){
							list.remove(j);
							break;
						}
					}
				}
			}
		}
		
		size = list.size();
		if(size > 100){
			System.out.println("Too Large");
		}
		
		for(i = size - 1; i >= 1; i--){	
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(i));
	}
	
}