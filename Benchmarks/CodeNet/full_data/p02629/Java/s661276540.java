import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String dogName = "";
		while(n>26){
	 		dogName += numberToAlphabet((n-1)%26);
			n=(n-1)/26;
		}
		dogName += numberToAlphabet(n);
		StringBuffer ans = new StringBuffer(dogName);
		System.out.println(ans.reverse().toString());
    }
  	
  	public static String numberToAlphabet(int num){
		switch (num){
  	case 0:
    	return("a");
  case 1:
    return("b");
  case 2:
    return("c");
  case 3:
    return("d");
  case 4:
    return("e");
  case 5:
    return("f");
  case 6:
    return("g");
  case 7:
    return("h");
  case 8:
    return("i");
  case 9:
    return("j");
  case 10:
    return("k");
  case 11:
    return("l");
  case 12:
    return("m");
  case 13:
    return("n");
  case 14:
    return("o");
  case 15:
    return("p");
  case 16:
    return("q");
  case 17:
    return("r");
  case 18:
    return("s");
  case 29:
    return("t");
  case 20:
    return("u");
  case 21:
    return("v");
  case 22:
    return("w");
  case 23:
    return("x");
  case 24:
    return("y");
  case 25:
    return("z");
}
      return("");
    }
  
}