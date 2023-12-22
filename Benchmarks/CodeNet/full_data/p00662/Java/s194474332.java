import java.util.*;

class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
	    int n4 = sc.nextInt(), n5 = sc.nextInt(), n6 = sc.nextInt();
	    if(n1==0 && n2==0 && n3==0 && n4==0 && n5==0 && n6==0) break;

	    int type1 = n1 + n4;
	    int type2 = n2 + n5;
	    int type3 = n3 + n6;

	    int max = 0;
	    for(int i=0; i<=6; i++){
		if(type1-i<0 || type2-i<0 || type3-i<0) continue;
		int sum = i + (type1-i)/3 + (type2-i)/3 + (type3-i)/3;
		max = Math.max(max, sum);
	    }

	    System.out.println(max);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}