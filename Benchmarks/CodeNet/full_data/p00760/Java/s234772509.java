import java.util.*;
class Main{
    public static void main(String []args){
	Scanner sc =new Scanner (System.in);
	int n = sc.nextInt();
	int all = cal(1000,1,1);
	for(int i = 0 ; i < n ; i++ ){
	    int year = sc.nextInt();
	    int month = sc.nextInt();
	    int day = sc.nextInt();
	    System.out.println(all - cal(year,month,day));
	}

    }
    static int cal(int year,int month,int date){
	int y = 1;
	int m = 1;
	int d = 1;
	int sum = 0;
	int monthDay;
	while(!(y ==  year && m ==  month && d == date)){
	    sum++;
	    if(y % 3 == 0){
		monthDay = 20;
	    }else if(m % 2 == 0){
		monthDay = 19;
	    }else{
		monthDay = 20;
	    }
	    
	    if(monthDay >  d){
		d++;
	    }else{
		d = 1;
		if(m < 10){
		    m++;
		}else{
		    m = 1;
		    y++;
		}
	    }
	}
	return sum;
    }
    
}