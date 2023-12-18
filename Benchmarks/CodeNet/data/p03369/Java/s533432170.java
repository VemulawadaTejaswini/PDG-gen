import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = 700;
		for(int i = 0;i < 3;i++){
			if(s.charAt(i)=="o".toCharArray()[0]){
				n += 100;
			}
		}
		System.out.println(n);
	}
}
