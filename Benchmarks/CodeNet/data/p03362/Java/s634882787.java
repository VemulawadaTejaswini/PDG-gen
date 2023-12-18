import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = new Scanner(System.in).nextInt();
		
		int 上限 = 55556;
		ArrayList <Integer> Sosuu =new ArrayList<Integer>();
		int list=2,warukazu,amari,so=1;
		Sosuu.add(2);
		long start = System.currentTimeMillis();
		for(int i=3; i < 上限 ;i+=2){
			warukazu = 0;
			amari=1;
				
			while(amari!=0){
				amari = i % Sosuu.get(warukazu);
				if( Sosuu.size() < warukazu || Sosuu.get(warukazu) > i/2){
					amari=0;
					Sosuu.add(i);
					list++;
					if(list>14){
						list = 0;
					}
					break;
				}
				warukazu++;
			}
		}		

		boolean end=false;
		int counter=0;
		while(!end) {
			int sum =0;
			int[] getIn=new int[N];
			
			for(int i=counter;i<N;i++) {
				sum+=Sosuu.get(i);
				getIn[i]=i;
			}
			String output="";
			if(Sosuu.indexOf(sum)==-1) {
				for(int c : getIn) {
					output+=Sosuu.get(c)+" ";
				}
				output.trim();
				System.out.println(output);
				end=true;
			}
			counter++;
		}
	}
}