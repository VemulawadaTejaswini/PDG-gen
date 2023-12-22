
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			int[] length = new int[10];
			int[] v = new int[2];
			String str = stdIn.nextLine();
			int j = 0;
			int k = 0;
			
			for(int i=0;i<str.length();i++){
				if('0'<=str.charAt(i) && str.charAt(i)<='9'){
					length[j] = length[j] * 10;
					length[j] += (int)str.charAt(i)-(int)'0';
				}
				else{
					j++;
					if(j==10){
						k = i + 1;
						break;
					}
				}
			}
			j = 0;
			for(int i=k;i<str.length();i++){
				if('0'<=str.charAt(i) && str.charAt(i)<='9'){
					v[j] = v[j] * 10;
					v[j] += (int)str.charAt(i)-(int)'0';
				}
				else{
					j++;
				}
			}
			
			int l = 0;
			for(int i=0;i<10;i++){
				l += length[i];
			}
			double t = (double)l/(v[0]+v[1]);
			double len = v[0]*t;
			
			j=0;
			double le = 0;
			while(true){
				le += (double)length[j];
				if(le>=len){
					System.out.println(j+1);
					break;
				}
				j++;
			}
		}
	}
}