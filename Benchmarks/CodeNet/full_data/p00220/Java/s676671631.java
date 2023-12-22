import java.util.Scanner;

public class Main{
    public Main(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    float v = sc.nextFloat();
	    if(v == -1.0){
		break;
	    }
	    int t = (int)v;
	    String str = "";
	    while(t >= 1 && str.length() <= 8){
		str = Integer.toString(t%2) + str;
		t /= 2;
	    }
	    int s = str.length();
	    if(s > 8){
		System.out.println("NA");
		continue;
	    }
	    for(int i = 8 - s; i > 0; i--){
		str = "0" +str;
	    }
	    v = v - (int)v;
	    String st = "";
	    while(v !=  0.0 && st.length() <= 4){
		v *= 2;
		st += Integer.toString((int)(v));
		if(v >= 1.0){
		    v -= 1.0;
		}
	    }
	    s = st.length();
	    if(s > 4){
		System.out.println("NA");
		continue;
	    }

	    for(int i = 4 - s; i > 0; i--){
		st += "0";
	    }

	    System.out.println(str+"."+st);
	}
    }

    public static void main(String[] args){
	new Main();
    }
}