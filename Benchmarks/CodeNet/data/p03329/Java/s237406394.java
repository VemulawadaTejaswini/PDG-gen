import java.util.Scanner;

class ABC099C {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Six = 6,Nine = 9;
		boolean flag = true;

		while(Nine < N){
			Nine *= 9;
		}
		Nine /= 9;

		while(Six < N){
			Six *= 6;
		}
		Six /= 6;

		int count = 0;
		while(Nine >= 9){
			if(!(N - Nine < 0)){
				N -= Nine;
				count++;
			}else if(!(N - Six < 0)){
				N -= Six;
				count++;
			}else{
				Nine /= 9;
				Six /= 6;
			}
		}

		while(N > 0){
			N--;
			count++;
		}

		System.out.println(count);	

	}
}

