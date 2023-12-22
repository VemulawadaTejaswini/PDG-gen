import static java.lang.System.*;

import java.util.*;

public class B {
	
	
	void run(){
		while(true){
			int s=sc.nextInt(),n=sc.nextInt(), t = sc.nextInt();
			String week = sc.next(), time = sc.next();
			int p = sc.nextInt(), m = sc.nextInt();
			if(s==0 && n==0 && t == 0)return;
			
			int count = 0;
			int w = 60*24*7;
			if (week.equals("All") && time.equals("All")){
				count = m;
			} else {

				if (!week.equals("All")) {
					int b;
					if (time.equals("All") || time.equals("Day")) {
						if (time.equals("All")) b = 1440;
						else b = 720;
						for (int begin = 0; begin < w; begin++) {
							int c = 0;
							for (int i = 0; i < m; i++) {
								if ((begin +i*t)%w <= b && (begin +i*t+s)%w < b) {
									c++;
								}
							}
							count = Math.max(count, c);
						}
					} else {
						b = 360;
						for (int begin = 0; begin < w; begin++) {
							int c = 0;
							for (int i = 0; i < m; i++) {
								if (((begin +i*t)%w <= b && (begin +i*t+s)%w < b) || (1080 <=(begin +i*t)%w && (begin +i*t)%w < b+1080 && (begin +i*t+s)%w < b+1080 && 1080 < (begin +i*t+s)%w)) {
									c++;
								}
							}
							count = Math.max(count, c);
						}
					}
				} else {
					int b;
					if (time.equals("All")) b = 1440;
					else b = 720;
					for (int begin = 0; begin < w; begin++) {
						int c = 0;
						for (int i = 0; i < m; i++) {
							boolean flag = false;
							for (int j = 0; j < 7; j++) {
								if (1440*j <= (begin +i*t)%w && (begin +i*t)%w < b+1440*j &&
										1440*j <= (begin +i*t+s)%w && (begin +i*t+s)%w < b+1440*j) {
									flag = true;
									break;
								}
							}
							if (flag)
								c++;
						}
						count = Math.max(count, c);
					}
				}
			}
			
			out.printf("%.10f\n", 1.0-Math.pow((double)(p-1)/p, n*count));
		}
	}
	
	public static void main(String[]_){
		new B().run();
		out.flush();
		out.close();
	}
	
	static Scanner sc=new Scanner(in);


}