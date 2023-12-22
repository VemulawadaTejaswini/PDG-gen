//AOJ10031FñðJEg·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] search = new int[n];
		for(int i=0; i < n; i++){
			search[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int [] patt = new int[m];
		for(int i=0; i < m; i++){
			patt[i] = sc.nextInt();
		}
		Arrays.sort(search);
		Arrays.sort(patt);
		int count =0;
		int i =0;
		int j=0;
		while(i < n && j< m){
			if(search[i] == patt[j]){
				count++;
				j++;
			}
			else if(search[i] > patt[j]){
				j++;
			}
			else{
				i++;
			}

		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}