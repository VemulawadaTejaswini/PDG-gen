public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();

		str1 = str1 +str1;
		if(str1.indexOf(str2) != -1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}