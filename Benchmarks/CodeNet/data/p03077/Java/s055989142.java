import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		long D = scan.nextLong();
		long E = scan.nextLong();
		long[] place = new long[6];
		place[0] = N;
		long countN = 0;
		long countTime = 0;
		while(countN<N){
			countTime++;
			if(place[4]<=E){
				place[5] = place[5] + place[4];
				place[4] = 0;
			}
			else{
				place[5] = place[5] + E;
				place[4] = place[4] - E;
			}

			countN = countN + place[5];
			place[5]=0;
			if(place[3]<=D){
				place[4] = place[4] + place[3];
				place[3] = 0;
			}
			else{
				place[4] = place[4] + D;
				place[3] = place[3] - D;
			}
			if(place[2]<=C){
				place[3] = place[3] + place[2];
				place[2] = 0;
			}
			else{
				place[3] = place[3] + C;
				place[2] = place[2] - C;
			}
			if(place[1]<=B){
				place[2] = place[2] + place[1];
				place[1] = 0;
			}
			else{
				place[2] = place[2] + B;
				place[1] = place[1] - B;
			}
			if(place[0]<=A){
				place[1] = place[1] + place[0];
				place[0] = 0;
			}
			else{
				place[1] = place[1] + A;
				place[0] = place[0] - A;
			}
		}
		System.out.println(countTime);
	}
}