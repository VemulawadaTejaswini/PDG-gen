import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean flag = false;

		String st[] = new String[N];

		for(int n=0;n<N;n++){
			st[n] = sc.next();
		}

		for(int n=0;n<N;n++){
			for(int m=n+1;m<N;m++){
				if(st[n].equals(st[m])){
					flag = true;
					break;
				}
			}
		}

		char ch = st[0].charAt(st[0].length()-1);
		for(int n=1;n<N;n++){
			if(ch != st[n].charAt(0)){
				flag = true;
				break;
			}
			ch = st[n].charAt(st[n].length()-1);
		}

		if(flag) System.out.println("No");
		else System.out.println("Yes");

	}
}