import java.util.*;

public class Main {
	int p, ace;
	
	void check(char cc){
		if(cc=='A'){
			ace++;
			p+=11;
		}else if(Character.isDigit(cc)){
			p+=cc-48;
		}else{
			p+=10;
		}
		if(p>21 && ace>0){
			ace--;
			p-=10;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			char[] c = new char[10];
			for(int j=0;j<10;j++) c[j] = sc.next().charAt(0);
			ace = 0;
			p = 0;
			check(c[0]);
			check(c[1]);
			if(p==21) System.out.println("blackjack");
			else{
				for(int j=2;j<10;j++){
					if(p==17 && ace>0 || p<17) check(c[j]);
					else{
						if(p>21) System.out.println("bust");
						else System.out.println(p);
						break;
					}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Main().run();
	}
}