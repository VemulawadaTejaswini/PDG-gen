import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
 
    void run(){
	while(sc.hasNext()){
	    int m = sc.nextInt();
	    int d = sc.nextInt();
	    if(m!=0 && d!=0)
		solve(m, d);
	}
    }

    void solve(int m, int d){
	int nowMonth = 1;
	int nowDay = 1;
	int now = 3;

	while(m!=nowMonth || d!=nowDay){
	    nowDay++;
	    now = (now+1)%7;
	    if(nowDay > month[nowMonth-1]){
		nowDay = 1;
		nowMonth++;
	    }
	}

	System.out.println(days[now]);
    }
}