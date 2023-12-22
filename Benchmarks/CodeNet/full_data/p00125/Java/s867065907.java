import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	int[] mon = {

		0,31,28,31,30,31,30,31,31,30,31,30,31	

	};

	class date{

		int y;

		int m;

		int d;

		date(int q,int w,int e){

			y = q;

			m = w;

			d = e;

		}

		long serialValue(){

			long ret = 0;

			int y = this.y-1;

			ret += y*365;

			ret += y/4;

			ret -= y/100;

			ret += y/400;

			for(int i = 0; i < m;i++){

				ret += mon[i];

			}

			if(y%400 == 0 ||(y%100!=0&&y%4!=0) ){

				if(m > 2){

					ret += 1;

				}

			}

			ret += d;

			return ret;

		}

	}

	void run(){

		for(;;){

			int [] in = new int[6];

			int flag = 0;

			for(int i= 0; i < 6;i++){

				in[i] = sc.nextInt();

				flag |= in[i];

			}

			if(flag < 0){

				break;

			}

			date a = new date(in[0],in[1],in[2]);

			date b = new date(in[3],in[4],in[5]);

			System.out.println(b.serialValue() - a.serialValue());

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}