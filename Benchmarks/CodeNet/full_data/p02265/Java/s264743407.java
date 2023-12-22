import java.util.Scanner;
import java.util.ArrayList;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] t = scan.nextLine().split("\\s");
		int n = Integer.parseInt(t[0]);
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < n; i++){
			String[] str = scan.nextLine().split("\\s");
			String meirei = str[0];

			if(meirei.equals("insert")){
				list.add(Integer.parseInt(str[1]));
			}else if(meirei.equals("delete")){
				for(int j = 0; j < list.size(); j++){
					if(Integer.parseInt(str[1]) == list.get(j)){
						list.remove(j);
					}
				}
			}else if(meirei.equals("deleteFirst")){
				list.remove(list.size() - 1);
			}else if(meirei.equals("deleteLast")){
				list.remove(0);
			}
		}
		
		for(int i = list.size() - 1; i >= 0; i--){
			if(i != 0){
				System.out.print(list.get(i) + " ");
			}else{
				System.out.println(list.get(i));
			}
		}
	}
}