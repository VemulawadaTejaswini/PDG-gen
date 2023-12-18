import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int hairetsu_ookisa = sc.nextInt();
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String res;
		int[] hairetsu;
		int toori=0;
		long wa=0;
		int counter=2;
		StringTokenizer stoken;

		//res = bfr.readLine();
		hairetsu=new int[hairetsu_ookisa];
		//stoken=new StringTokenizer(res," ");

		for(int i=0; i<hairetsu_ookisa;   i++){
			//hairetsu[i]=Integer.parseInt(stoken.nextToken());
			hairetsu[i]=sc.nextInt();
		}

		for(int h=counter; h<=hairetsu_ookisa; h++){
			for(int j=0; j<hairetsu_ookisa-counter+1; j++){
				for(int l=0; l<counter; l++){
					wa+=hairetsu[j+l];
				}
				if(wa==0){
					toori++;
					wa=0;
				}
				else{wa=0;}
			}
			counter++;
		}

		System.out.println(""+toori);


	}
}