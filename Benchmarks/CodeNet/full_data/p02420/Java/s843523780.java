public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			String str = scan.next();
			if("-".equals(str)){
				break;
			}
			int n = scan.nextInt();
			for(int i = 0; i < n;i++){
				int h = scan.nextInt();
				str = str.substring(h)+str.substring(0, h);
			}
			System.out.println(str);

		}
	}

}