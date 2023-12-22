import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			float sumLen=0;
			int[] len = new int[10];
			String[] t = sc.nextLine().split(",");
			for(int i=0; i<10; i++){ len[i] = Integer.parseInt(t[i]); sumLen +=len[i]; }
			int v1 = Integer.parseInt(t[10]); int v2 = Integer.parseInt(t[11]); int s = len[0];
			double jdg = v1*sumLen/(v1+v2);
			
			for(int i=1; i<=10; i++){
				if(jdg<=s){ System.out.println(i); break;}
				s += len[i];
			}
			
			
		}

	}

}