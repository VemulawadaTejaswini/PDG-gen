import java.util.Arrays;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0221().doIt();
	}
	
	class AOJ0221{
		boolean[] person;
		int m,n;
		void doIt(){
			while(true){
				m = in.nextInt();n = in.nextInt();
				if(m+n==0)break;
				person = new boolean[m];
				int user = 0;
				for(int i=1;i<=n;i++){
					String input = in.next();
					String talk = getTalk(i);
//					System.out.println("User talk = "+input);
//					System.out.println("shouled talk = "+talk);
					if(input.equals(talk)==false){
						person[user] = true;
					}
					user = getUser(user);
//					System.out.println("next user is "+user);System.out.println();
				}
				int i;
				for(i=0;i<m;i++)if(person[i]==false){
					System.out.print(i+1);
					break;
				}
				for(i=i+1;i<m;i++)if(person[i]==false)System.out.print(" "+(i+1));
				System.out.println();
			}
		}
		
		String getTalk(int num){
			return num%15==0? "FizzBuzz" : num%3==0? "Fizz" : num%5==0? "Buzz":Integer.toString(num);
		}
		
		int getUser(int currentUser){
			for(int i=1;i<=m;i++)if(!person[(currentUser+i)%m])return (currentUser+i)%m;
			return -1;
		}
		
	}
	
}