import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int y1 = sc.nextInt();
	    int m1 = sc.nextInt();
	    int d1 = sc.nextInt();
	    int y2 = sc.nextInt();
	    int m2 = sc.nextInt();
	    int d2 = sc.nextInt();
	    if(y1 == -1){
		break;
	    }
	    Calendar cal1 = Calendar.getInstance();
	    Calendar cal2 = Calendar.getInstance();
	    cal1.set(y1, m1, d1);
	    cal2.set(y2, m2, d2);

	    Date dt1 = cal1.getTime();
	    Date dt2 = cal2.getTime();

	    long d = (dt2.getTime() - dt1.getTime())/(1000*60*60*24);

	    System.out.println(String.valueOf(d));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}