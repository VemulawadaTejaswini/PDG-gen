import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();
		StringBuffer str = new StringBuffer(S);

		for (int i = 0; i < Q; i++) {
			if(Integer.parseInt(sc.next()) ==1){
				str = str.reverse();
			}else{
				if(Integer.parseInt(sc.next())==1){
					str = str.insert(0, sc.next());
				}else{
					str = str.insert(str.length(), sc.next());
				}
			}	
		}
		System.out.println(str);
      	sc.close();
    }
		
}