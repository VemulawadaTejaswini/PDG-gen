package Main;

public class Main {


	public static void main(String args[]) {
		int k = Integer.parseInt(args[0]);

		if(k==1) {
			System.out.println("ACL");
		}

		else if(k==2) {
			System.out.println("ACLACL");
		}
		else if(k==3) {
			System.out.println("ACLACLACL");
		}
		else if(k==4) {
			System.out.println("ACLACLACLACL");
		}
		else if(k==5) {
			System.out.println("ACLACLACLACLACL");
		}
		else {
			System.out.println("１～５の数字を入力してください");
		}
	}


}
