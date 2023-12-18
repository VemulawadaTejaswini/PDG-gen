import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String ss[] = new String[4];
		sc.close();
		
		for(int i = 0; i < 4; i++) {
			ss[i] = str.substring(i , i + 1); 
		}
		
		String sa = str.replace(ss[0], "");
		if(sa.length() == 0) {
			System.out.println("No");
			return;
		}
		
		int target = 0;
		for(int i = 1; i < 4; i++) {
			if(ss[i].equals(ss[0])) {
				target = i;
				break;
			}
			if(i == 3) {
				System.out.println("No");
				return;
			}
		}
		
		if(target == 1){
		      if(ss[2].equals(ss[3])){
		        System.out.println("Yes");
		      }else{
		        System.out.println("No");
		      }
		    }else if(target == 2){
		      if(ss[1].equals(ss[3])){
		        System.out.println("Yes");
		      }else{
		        System.out.println("No");
		      }
		    }else{
		      if(ss[1].equals(ss[2])){
		        System.out.println("Yes");
		      }else{
		        System.out.println("No");
		      }
		 }
	}
}