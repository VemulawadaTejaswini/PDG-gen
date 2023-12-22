import java.util.*;
public class Main{
    public static void main(String[]args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    int[] age;
    int n;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    age = new int[7];
	    if(n!=0) solve();
	}
    }

    void solve(){
	while(n>0){
	    n--;
	    int a = sc.nextInt();
	    if(a>=60){
		age[6]++;
	    }
	    else age[a/10]++;
	}
	for(int i=0; i<7; i++)
	    System.out.println(age[i]);
    }
}