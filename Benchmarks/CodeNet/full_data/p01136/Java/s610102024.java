import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    boolean[][] date;
    int[] d;
    int n, f;
    int count;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n!=0){
		date = new boolean[n][31]; // [人][空いている日]
		count = 0;
		d = new int[31]; // その日何人集まれるか

		for(int i=0; i<n; i++){
		    int c = sc.nextInt();
		    while(c>0){
			c--;
			int t = sc.nextInt();
			date[i][t] = true;
			d[t]++;
		    }
		}

		for(int k=0; k<31; k++){
		    boolean DC = false;
		    int x = getMax();
		    //System.out.println(x);
		    if(d[x]!=-1 && d[x]<=1) break;
		    for(int i=0; i<n; i++)
			if(date[i][x] && !date[i][0]){
			    date[i][0] = true;
			    if(!DC){
				count++;
				DC = true;
			    }
			}
		}
		//show();
		System.out.println(count<31 ? count:-1);
	    }
	}
    }

    int getMax(){
	int Mday=0, Mmen=0;
	for(int i=1; i<31; i++)
	    if(Mmen < d[i]){
		Mmen = d[i];
		Mday = i;
	    }
	d[Mday] = -1;
	return Mday;
    }

    void show(){
	for(int i=0; i<n; i++){
	    for(int k=0; k<31; k++)
		System.out.print(date[i][k] ? "O":"X");
	    System.out.println();
	}
    }
}