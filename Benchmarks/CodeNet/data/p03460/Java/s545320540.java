import java.util.*;

class Main2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();

		int x[] = new int[num];
		int y[] = new int[num];
		int c[] = new int[num];

		for(int n=0;n<num;n++){
			x[n] = sc.nextInt();
			y[n] = sc.nextInt();

			String s = sc.next();
			if(s.equals("B")) c[n] = 1;
			else c[n] = 0;
		}

		
		int maxsat = 0;
		for(int l=0;l<k;l++){
			for(int m=0;m<k;m++){
				
				int sat = 0;

				for(int n=0;n<num;n++){
					int cbw = ((x[n]+l/k)%2 + (y[n]+m/k)%2)%2;
					if(cbw == c[n]) sat++;
				}
				if(sat < num-sat) sat = num-sat; 
				if(sat > maxsat) maxsat = sat;
			}
		}

		System.out.println(maxsat);
	}
}