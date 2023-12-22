import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int data = sc.nextInt();
			if(data==0) break;
			Train[] train = new Train[data];
			for(int i=0; i<data; i++){
				train[i] = new Train(sc.next(), sc.next());
			}

			int cnt = 0, j = 0;
			for(int i=0; i<data; i++){
				if(train[i].check){
					train[i].check = false;
					cnt++;
					j = i + 1;
					while(j<data){
						if(!train[j].check || train[i].arrive>train[j].leave){
							j++;
							continue;
						}
						train[j].check = false;
						train[i] = train[j++];
					}
				}
			}

			System.out.println(cnt);
		}
	}

	static class Train{
		int leave, arrive;
		boolean check;
		Train(String l, String a){
			String[] lv = l.split(":");
			leave = Integer.parseInt(lv[0])*3600 + Integer.parseInt(lv[1])*60 + Integer.parseInt(lv[2]);
			String[] ar = a.split(":");
			arrive = Integer.parseInt(ar[0])*3600 + Integer.parseInt(ar[1])*60 + Integer.parseInt(ar[2]);	
			check = true;
		}
	}
}