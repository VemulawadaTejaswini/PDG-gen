import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long[] h = new long[n];
		long count = 0;

		for (int i=0; i<n; i++){
			h[i] = sc.nextInt();
		}

		while(true){
			int check = 0;		
			for(int i=0; i<n; i++){
				if (h[i] > 0){
					check++;
				}
			}
			if (check == 0){
				System.out.println(count);
				break;
			}

			long max = -2;
			long sec = -1;
			int point = -1;
			for(int i=0; i<n; i++){
				if (h[i] >= max){
					sec = max;
					max = h[i];
					point = i;
				}
				else if(h[i] > sec){
					sec = h[i];
				}
			}

			long gap = 0;

			if ((max-sec)/(a-b) == 1){
				gap = 1;
			}
			else{
				gap = ((max-sec)/(a-b))+1;
			}

			for (int i=0; i<n; i++){
				if (i != point){
					h[i] = h[i]-b*gap;
				}
				else{
					h[i] = h[i]-a*gap;
				}
			}

			count += gap;

		}


	}
}