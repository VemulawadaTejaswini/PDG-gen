import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector<Integer>vec = new Vector<Integer>();
		while(n-->0){
			switch(sc.next()){
				case "insert":
					vec.add(sc.nextInt());
					break;
				case "delete":
					int target = sc.nextInt();
					while(vec.lastIndexOf(target)!=-1){
						vec.removeElementAt(vec.lastIndexOf(target));
					}
					break;
				case "deleteFirst":
					vec.removeElementAt(0);
					break;
				case "deleteLast":
					vec.removeElementAt(vec.size()-1);
			}
		}
		String str =vec.toString(); 
		str = str.replace("[","");
		str = str.replace("]","");
		str = str.replace(",","");
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
	}
}
