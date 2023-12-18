import java.util.*;
public class Main {

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			
		String s = sc.nextLine();
		String a = s.split(" ")[0];
		String b = s.split(" ")[1];
		
		int a_ = sc.nextInt();
		int b_ = sc.nextInt();
		
		String key = sc.next();
		
		if(a.equals(key)) {
			System.out.println(a_ - 1 + " " + b_);
		} else {
			System.out.println(a_ + " " + String.valueOf(--b_));
		}
		
		
//		int n = sc.nextInt();
//		
//		
//		Set<Integer> s = new HashSet<Integer>();
//		for(int i=0;i<n;i++) {
//			int a = sc.nextInt();
//			if(s.contains(a)) {
//				System.out.println("No");
//			}
//			s.add(a);
//		}
//		
//		System.out.println("Yes");
		
		
	}
	


}

 