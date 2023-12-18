import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		if(a.length()>b.length()) {
			System.out.println("GREATER");
		}else if(a.length()<b.length()) {
			System.out.println("LESS");
		}else{
			if(a.compareTo(b)>0) {
				System.out.println("GREATER");
			}else if(a.compareTo(b)<0){
				System.out.println("LESS");
			}else {
				System.out.println("EQUAL");
			}
		}
	}

}
