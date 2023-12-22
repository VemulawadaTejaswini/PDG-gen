import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = new String[]{
			"Rock", "Fire", "Scissors", "Snake", "Human",
			"Tree", "Wolf", "Sponge", "Paper", "Air",
			"Water", "Dragon", "Devil", "Lightning", "Gun"
		};
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			boolean[] f = new boolean[15];
			for(int i=0;i<n;i++){
				String t = sc.next();
				for(int j=0;j<15;j++){
					if(t.compareTo(s[j])==0){
						f[j] = true;
						break;
					}
				}
			}
			
			int win = -1;
			int cnt = 0;
			int p;
			for(int i=0;i<15;i++){
				if(f[i]){
					boolean flag = true;
					for(int j=1;j<=7;j++){
						p = i+j;
						if(p>14) p-=15;
						if(f[p]) flag = false;
					}
					if(flag==true) break;
					for(int j=1;j<=7;j++){
						p = i-j;
						if(p<0) p+=15;
						if(f[p]) flag = true;
					}
					if(flag==false){
						win = i;
						cnt++;
					}
				}
			}
			if(cnt==1) System.out.println(s[win]); 
			else System.out.println("Draw");
		}
	}

}