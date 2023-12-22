import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = "";
		Main r = new Main();
		while(sc.hasNext()){
			a = sc.nextLine();
			int x=a.length()-1;
			int sum = 0;
			char ch='I';
			ch = a.charAt(a.length()-1);
			sum += r.get(ch);
			for(int i=a.length()-2;i>=0;i--){
				if(r.get(ch)<=r.get(a.charAt(i))){
					ch = a.charAt(i);
					sum+=r.get(ch);
				}
				else
					sum-=r.get(a.charAt(i));
			}
			System.out.println(sum);
			sum = 0;
		}
	}
	
	public int get(char ch){
		int x = 0;
		if(ch=='I')
			x = 1;
		else if(ch=='V')
			x = 5;
		else if(ch=='X')
			x = 10;
		else if(ch=='L')
			x = 50;
		else if(ch=='C')
			x = 100;
		else if(ch=='D')
			x = 500;
		else if(ch=='M')
			x = 1000;
		return x;
	}
}