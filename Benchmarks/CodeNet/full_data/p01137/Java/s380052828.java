import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int e = kbd.nextInt();
	    if(e != 0){
		int ans = solve(e);
		System.out.println(ans);
	    }
	}
    }

    static int solve(int e){
	int ans=e, x, y, z;

	for(x=0; x<=e; x++){
	    for(y=0; y<=(int)Math.sqrt(e); y++){
		for(z=0; z<=(int)Math.sqrt(e); z++){
		    int s = x + y*y +z*z*z;
		    int r = x+y+z;
		    if(s==e && r<ans) ans = r;
		}
	    }
	}
	return ans;
    }
}