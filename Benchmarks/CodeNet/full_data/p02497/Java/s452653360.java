import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> set=new ArrayList<Integer>();
		ArrayList<Integer> result=new ArrayList<Integer>();
		int a=1;
		int b=1;
		int c=1;
		String grade="FDCBA";
		while (!(a==-1 && b==-1 && c==-1)){
			a=in.nextInt();
			b=in.nextInt();
			c=in.nextInt();
			set.add(a);
			set.add(b);
			set.add(c);
		}
		for(int k=0;k<(set.size()-3);k+=3){
			a=set.get(k);
			b=set.get(k+1);
			c=set.get(k+2);
			if (a==-1 ||b==-1){
				result.add(0);
			}else if ((a+b)>=80) {
				result.add(4);
			}else if ((a+b)>=65) {
				result.add(3);
			}else if ((a+b)>=50) {
				result.add(2);
			}else if ((a+b)>=30) {
				if (c >= 50) {
					result.add(2);
				}else{
				result.add(1);
				}
			}else if((a+b)<30){
				result.add(0);
			}
		}

		for (int i=0;i<result.size();i++) {
			System.out.printf("%c%n",grade.charAt(result.get(i)));
		}

	}
}