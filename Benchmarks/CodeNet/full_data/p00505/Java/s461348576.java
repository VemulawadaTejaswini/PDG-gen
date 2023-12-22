import java.util.NoSuchElementException;
import java.util.Scanner;


class Main{

	public static void main(String[] a){
		int sankaku=0;
		int eikaku=0;
		int donkaku=0;
		int cyokkaku=0;
		int[] hen=new int[3];

		Scanner sc = new Scanner(System.in);;

		while(true) {
			try {
			int hen1=sc.nextInt();
			int hen2=sc.nextInt();
			int hen3=sc.nextInt();

			hen[0]=hen1;
			hen[1]=hen2;
			hen[2]=hen3;
			int maximum=Math.max(hen1,Math.max(hen2,hen3));

			if(hen[0]==maximum) hen[0]=0;
			if(hen[1]==maximum) hen[1]=0;
			if(hen[2]==maximum) hen[2]=0;
			int middle=Math.max(hen1,Math.max(hen2,hen3));
			if(hen[0]==middle) hen[0]=0;
			if(hen[1]==middle) hen[1]=0;
			if(hen[2]==middle) hen[2]=0;
			int minimal=Math.max(hen1,Math.max(hen2,hen3));

			if(maximum<=middle+minimal || minimal<maximum-middle) {
				//nanimonai
			}
			else if(maximum*maximum==minimal*minimal+middle*middle) {
				sankaku++;
				cyokkaku++;
			}
			else if(maximum*maximum>minimal*minimal+middle*middle) {
				sankaku++;
				donkaku++;
			}
			else if(maximum*maximum<minimal*minimal+middle*middle) {
				sankaku++;
				eikaku++;
			}

		}catch(NoSuchElementException e) {
			System.out.println(sankaku+" "+cyokkaku+""+eikaku+""+donkaku);
			}
		}
	}
}

// imi fumei no runtime error
