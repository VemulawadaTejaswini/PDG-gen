import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String Roman = sc.next();

	    int ans = getNum(Roman);

	    System.out.println(ans);
	}
    }

    public static int getNum(String roman){
	int sum = 0;
	int a = 0;
	if(roman.length()>1){
	    a = getFigure(roman.substring(roman.length()-2,roman.length()-1));
	}
	int b = getFigure(roman.substring(roman.length()-1,roman.length()));
	sum = b;
	if(a<b){sum -= a;}
	if(a>=b){sum += a;}
	for(int i=roman.length()-3; i>=0; i--){
	    b = a;
	    if(i!=-1)a = getFigure(roman.substring(i,i+1));
	    if(a<b){sum -= a;}
	    if(a>=b){sum += a;}
	}
	return sum;
    }

    public static int getFigure(String num){
	if(num.equals("I")){return 1;}
	if(num.equals("V")){return 5;}
	if(num.equals("X")){return 10;}
	if(num.equals("L")){return 50;}
	if(num.equals("C")){return 100;}
	if(num.equals("D")){return 500;}
	if(num.equals("M")){return 1000;}
	return 0;
    }
}