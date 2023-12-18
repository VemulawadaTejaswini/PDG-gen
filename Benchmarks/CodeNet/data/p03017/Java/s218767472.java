import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String s = sc.next();
	    char front='o';
		boolean ch=false;
		for(int i=0; i<n; i++){
			if(s.charAt(i)=='#'){
				if(front=='#'){
					System.out.println("No");
					return;
				}
				front='#';
			}else{
				front='.';
				if(i==b-1){
					ch=true;
				}
				if(ch){
					if(i!=n-1 && s.charAt(i-1)=='.' && s.charAt(i+1)=='.' ){
						System.out.println("Yes");
						return;
					}
				}
				if(i==d-1){
					break;
				}
			}
		}
		if(c<d){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
