import java.util.Scanner;

public class Main{
    String[][] tb = {
	{},
	{"", "a", "f", "k", "p", "u", "z"},
	{"", "b", "g", "l", "q", "v", "."},
	{"", "c", "h", "m", "r", "w", "?"},
	{"", "d", "i", "n", "s", "x", "!"},
	{"", "e", "j", "o", "t", "y", " "}
    };

    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String res = "";
	    char[] ch = (sc.next()).toCharArray();
	    if(ch.length%2 == 1){
		res = "NA";
	    } else {
		for(int i = 0; i < ch.length; i+=2){
		    int w = (int)(ch[i]-'0'), h = (int)(ch[i+1]-'0');
		    if(h > 5 || h == 0 || w > 6 || w == 0){
			res = "NA";
			break;
		    }
		    res += tb[h][w];
		}
	    }

	    System.out.println(res);
	}
    }

    public static void main(String[] args){
	new Main();
    }
}