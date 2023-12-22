
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		String[] tarou = new String[n];
		String[] hanako = new String[n];
		int tarou_score = 0;
		int hanako_score = 0;
		for(int i=0;i<n;i++){
			tarou[i] = stdIn.next();
			hanako[i] = stdIn.next();
		}
		
		for(int i=0;i<n;i++){
			if(tarou[i].compareTo(hanako[i])>0){
				tarou_score += 3;
			}
			else if(tarou[i].compareTo(hanako[i])<0){
				hanako_score += 3;
			}
			else{
				tarou_score += 1;
				hanako_score += 1;
			}
		}
		
		System.out.println(tarou_score+" "+hanako_score);
	}
}