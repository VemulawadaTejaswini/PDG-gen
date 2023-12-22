public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		int h = scan.nextInt();

		do{
			if("-".equals(h)){
				break;
			}
			for(int i = 0; i < n;i++){
				str = str.substring(h)+str.codePointCount(0, h);
			}
			System.out.println(str);
		}while(scan.hasNext());

	}

}