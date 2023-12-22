import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    /*String str=reader.readLine();
	    String s1[]=str.split(" ");
	    int a=Integer.parseInt(s1[0]);
	    int b=Integer.parseInt(s1[1]);*/

	    int x=Integer.parseInt(reader.readLine());

	    if(x==1||x==8||x==15||x==22||x==29){
		System.out.println("fri");
	    }else if(x==2||x==9||x==16||x==23||x==30){
		System.out.println("sat");
	    }else if(x==3||x==10||x==17||x==24||x==31){
		System.out.println("sun");
	    }else if(x==4||x==11||x==18||x==25){
		System.out.println("mon");
	    }else if(x==5||x==12||x==19||x==26){
		System.out.println("tue");
	    }else if(x==6||x==13||x==20||x==27){
		System.out.println("wed");
	    }else if(x==7||x==14||x==21||x==28){
		System.out.println("thu");
	    }
	    
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int gcd (int a, int b){
	return b>0?gcd(b,a%b):a;
    }
    static int lcm (int a, int b) {
	return a*b/gcd(a,b);
    }
}

