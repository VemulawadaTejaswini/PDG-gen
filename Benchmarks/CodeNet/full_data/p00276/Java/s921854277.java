import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
        int team;
	int z;
	int q = scan.nextInt();
	for(int i=1;i<=q;i++){
	    team = 0;
	    z = 0;
	    int c = scan.nextInt();
	    int a = scan.nextInt();
	    int n = scan.nextInt();
	    while(true){
		if(z == 1) break;
		if(c >= 1  && a >= 1 && n >= 1){
		    team = team +1;
		    c = c - 1;
		    a = a - 1;
		    n = n - 1;
		}else if(c >= 2 && a >= 1){
		    team = team + 1;
		    c = c - 2;
		    a = a - 1;
		}else if(c >= 3){
		    team = team + 1;
		    c = c -3;
		}else{
		    z = z + 1;
		}
	    }
	    System.out.println(team);
	    c = 0; a = 0; n = 0;
	}
    }
}