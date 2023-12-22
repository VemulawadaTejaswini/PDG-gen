import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 	int p,r,a;
	  	int n = sc.nextInt();
	  	for(int i=0; i<n; i++){
			a=0;r=0;p=0;
			while(a<3){
				String t = sc.next();
				if(t.equal("HIT")){
					r++;
					if(r>3) {r--;p++;}
				} else if(t.equal("OUT")){
					a++;
				} else {
					p+=r+1;
					r=0:
				}
			}
			System.out.println(p);
	  	}
	}
}