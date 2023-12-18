
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		String[] bord = value.split("");
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<value.length();i++){
			list.add(bord[i]);
		}
		int count=0;
		Boolean flag = true;
		while(true){
			for(int i=0;i<list.size();i++){
				if(!list.get(i).equals(list.get(0))) flag =false;
			}

			if(flag) break;
			flag=true;
			if(list.get(list.size()-1).equals("W")){
				list.add("B");
				count++;
				for(int i=list.size()-2;i>0;i--){
					if(list.get(i).equals("B")) break;
					list.set(i,"B");
				}
			}else{
				list.add("W");
				count++;
				for(int i=list.size()-2;i>0;i--){
					if(list.get(i).equals("W")) break;
					list.set(i,"W");
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
