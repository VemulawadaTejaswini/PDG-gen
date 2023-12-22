import java.util.*;
import java.awt.geom.*;
import java.io.*;
public class Main{
	//0108 cording start
	//0115 cording end
	int [] die;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			char [] data = new char[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.next().charAt(0);
			}
			
			die = new int[7];
			for(int i = 0; i <= 6; i++){
				die [i] = i;
			}
			
			for(int i = 0; i < n; i++){
				switch(data[i]){
				case 'n':
					swap(1,2,6,5);
					break;
				case 's':
					swap(1,5,6,2);
					break;
				case 'e':
					swap(1,4,6,3);
					break;
				case 'w':
					swap(1,3,6,4);
					break;
				}
			}
			System.out.println(die[1]);
		}
	}

	private void swap(int i, int j, int k, int l) {
		int temp = die[l];
		die[l] = die[k];
		die[k] = die[j];
		die[j] = die[i];
		die[i] = temp;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}