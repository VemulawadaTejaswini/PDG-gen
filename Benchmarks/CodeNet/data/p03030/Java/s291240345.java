//package atCoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int m = sc.nextInt();
		int i,j;
				
		Rest[] rests = new Rest[n];
		
		for(i=0;i<n;i++) {
			Rest target = new Rest(sc.next(),sc.nextInt(),i+1);
			for(j=i;j>0;j--) {
				int eval =target.city.compareTo(rests[j-1].city);
				if(eval<0)
					rests[j]=rests[j-1];
				else if(eval==0 && target.point > rests[j-1].point)
					rests[j]=rests[j-1];
				else {
					rests[j] = target;
					break;
				}
			}
			if(j==0)
				rests[0]=target;
		}
		sc.close();
		
		for(i=0;i<n;i++)
			System.out.println(rests[i].index);
	}
}

class Rest{
	String city;
	int point;
	int index;
	
	Rest(String city,int point,int index){
		this.city = city;
		this.point = point;
		this.index = index;
	}
}
/*
 * xor
 */