import java.util.Scanner;

public class Main{
    boolean[] prm;
    final int mx = 10001;

    void mkPrm(){
	prm = new boolean[mx];
	for(int i = 0; i < mx; i++) prm[i] = true;
	prm[0] = prm[1] = false;

	for(int i = 0; i < mx; i++)
	    if(prm[i])
		for(int j = i+i; j < mx; j+=i) prm[j] = false;

	return ;
    }

    Main(){
	Scanner sc = new Scanner(System.in);
	mkPrm();

	while(sc.hasNext()){
	    int n = sc.nextInt(), cnt = 0;

	    for(int i = 0; i < n; i++)
		if(prm[i+1] && prm[n-i]) cnt++;

	    System.out.println(String.valueOf(cnt));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}