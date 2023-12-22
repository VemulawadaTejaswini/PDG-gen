import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	String str[] = new String[n];
	int l[] = new int[3];

	for(int i = 0; i < n; i++){
	    l[0] = scan.nextInt();
	    l[1] = scan.nextInt();
	    l[2] = scan.nextInt();

	    Arrays.sort(l);

	    if((l[0]^2)+(l[1]^2) == (l[2]^2)){
		str[i] = "YES";
	    }else{
		str[i] = "NO";
	    }
	}

	for(String s:str){
	    System.out.println(s);
	}
     }
 }