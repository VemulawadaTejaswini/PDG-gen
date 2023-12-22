import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
    String val1[] = {"yotta", "zetta", "exa", "peta", "tera", "giga", "mega", "kilo"};
    String val2[] = {"yocto", "zepto", "ato", "femto", "pico", "nano", "micro", "milli"};

    Main(){
	Scanner sc = new Scanner(System.in);
	BigDecimal ten = new BigDecimal(10);
	BigDecimal one = new BigDecimal(1);

	while(sc.hasNext()){
	    int n = Integer.parseInt(sc.nextLine());
	    for(int k = 0; k < n; k++){
		String[] str = (sc.nextLine()).split(" ");
		int v = 0;
		String s1, s2;
		if(str.length == 3){
		    s1 = str[2];
		    v = convertTo(str[1]);
		} else {
		    s1 = str[1];
		    v = 0;
		}		
		char[] ch = str[0].toCharArray();
		if(ch.length > 1){
		    if(ch[0] != '0' && ch[1] == '.'){
			s2 = str[0];
		    } else {
			if(ch[0] == '0'){
			    BigDecimal bd = new BigDecimal(str[0]);
			    while(bd.compareTo(one) == -1){
				v--;
				bd = bd.multiply(ten);
			    }
			    s2 = bd.toString();
			    char[] ch2 = s2.toCharArray();
			    int p = ch2.length-1;
			    for(int i = p; i >= 0; i--){
				if(ch2[i] != '0'){
				    p = i;
				    break;
				}
			    }
			    if(p == 1){
				s2 = String.valueOf(ch2[0]);
			    } else {
				s2 = s2.substring(0, p+1);
			    }
			} else {
			    int p = ch.length;
			    for(int i = 2; i < p; i++){
				if(ch[i] == '.'){
				    p = i;
				    break;
				}
			    }
			    v += (p-1);			   
			    s2 = String.valueOf(ch[0]) + ".";
			    for(int i = 1, l = ch.length; i < l; i++){
				if(ch[i] == '.'){
				    continue;
				}
				s2 += String.valueOf(ch[i]);
			    }
			}
		    }
		} else {
		    s2 = str[0];
		}

		System.out.println(s2+ " * 10^"+Integer.toString(v)+" "+s1);
	    }
	}
    }


    int convertTo(String str){
	if(str.equals("hecto")){
	    return 2;
	} else if(str.equals("deca")){
	    return 1;
	} else if(str.equals("deci")){
	    return -1;
	} else if(str.equals("centi")){
	    return -2;
	}

	int v = 24;
	boolean f = false;
	for(int i = 0, l = val1.length; i < l; i++, v-=3){
	    if(str.equals(val1[i])){
		f = true;
		break;
	    }
	}

	if(f){
	    return v;
	}
	v = -24;
	for(int i = 0, l = val2.length; i < l; i++, v+=3){
	    if(str.equals(val2[i])){
		break;
	    }
	}

	return v;
    }

    public static void main(String[] args){
	new Main();
    }
}