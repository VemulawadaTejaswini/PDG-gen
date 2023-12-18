import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();
		boolean isOk=true;
		
		for(int n = 0; n<S.length()-1; n++){
			char a = S.charAt(n);
			for(int m = n+1; m<S.length(); m++){
				char b = S.charAt(m);
				if(a==b){
					if(T.charAt(n)!=T.charAt(m)){
						isOk=false;
					}
				}else{
					if(T.charAt(n)==T.charAt(m)){
						isOk=false;
					}
				}
			}
		}
		System.out.println(isOk ? "Yes":"No");
	}

}