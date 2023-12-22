public class Main {
	public static void main(String[] age){

		int x = new java.util.Scanner(System.in).nextInt();
		StringBuffer sb = new StringBuffer();
		int i = 1;

		while( i<=x ){
			if( i%3==0 ){
				sb.append(" ").append(Integer.toString(i));
			}else if( i%10==3 ){
				sb.append(" ").append(Integer.toString(i));
			}
			i++;
		}
		System.out.print(sb);
	}
}