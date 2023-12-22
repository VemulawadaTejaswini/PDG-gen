import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int value = sc.nextInt();
			int value2 = sc.nextInt();
			if(value == 0 && value2 == 0){
				break;
			}
			else{
				calc(value, value2);
			}
		}
	}
	public void calc(int n, int p){
		int[] kouho = new int[n];
		for(int i = 0; i < n; i++){
			kouho[i] = 0;
		}
		int wan = p;
		int i = 0;
		while(true){
		  if(wan != 0){
			  kouho[i] = kouho[i]+1;
			  wan = wan -1;
			  if(wan == 0 && kouho[i] == p){
				  System.out.println(i);
				  break;
			  }
			  i = i + 1;
			  if(i == n) i = 0;
		  }
		  else{
			  wan = kouho[i];
			  kouho[i] = 0;
			  i = i + 1;
			  if(i == n) i = 0;
		  }
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}