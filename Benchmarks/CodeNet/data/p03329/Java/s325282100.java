public static int solution(int number) {
		
		int count=0;
		while(number>=6) {
			int x=6,y=9;
			while(number>x){
				x=6*x;
			}
			x=x/6;
			while(number>y) {
				y=9*y;
			}y=y/9;
			if(y>=x) {
				number=number-y;
			}else {number=number-x;}
			
			count++;
			
		}
		return count+number;