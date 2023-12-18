import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int min = h;

		if ( (h*w)%3 == 0 ){
			System.out.println("0");
		}
		else{
			if (w < h){
				min = w;
			}

			for (int i = 1; i < h/2+1; i++){
				for (int j = 1; j < w/2+1; j++){
					long s0 = h*j;
					long s1 = i*(w-j);
					long s2 = (w-j)*(h-i);
					long max = 0;
					if (Math.abs(s1-s0)>max){
						max = Math.abs(s1-s0);
					}
					if (Math.abs(s2-s0)>max){
						max = Math.abs(s2-s0);
					}
					if (Math.abs(s2-s1)>max){
						max = Math.abs(s2-s1);
					}
					if (max < min){
						min = (int)max;
					}
				}
			}
			for (int i = 1; i < h/2+1; i++){
				for (int j = 1; j < w/2+1; j++){
					long s0 = i*w;
					long s1 = (h-i)*j;
					long s2 = (w-j)*(h-i);
					long max = 0;
					if (Math.abs(s1-s0)>max){
						max = Math.abs(s1-s0);
					}
					if (Math.abs(s2-s0)>max){
						max = Math.abs(s2-s0);
					}
					if (Math.abs(s2-s1)>max){
						max = Math.abs(s2-s1);
					}
					if (max < min){
						min = (int)max;
					}
				}
			}

			System.out.println(min);

		}

	}
}	