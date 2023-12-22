//Volume5-0521
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);


		final int[] t   = {500,100,50,10,5,1};
		final int   EOF = 1000;
		      int   c,num;

		while(true){
			num = 0;
			c = 1000-sc.nextInt();
			if(c==EOF){break;}
			for(int i=0;i<t.length;i++){
				if(c/t[i]!=0){num+=c/t[i];c=c%t[i];}
			}
			System.out.println(num);
		}
	}
}