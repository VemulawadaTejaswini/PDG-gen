// answered_by_prim

import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    class Pop{
	int point, number;
	String name;
	Pop(String s, int i){
	    number = i;
	    name = s;
	    point = 0;
	}
	void addPoint(int a){ point += a; }
	String getName(){ return name; }
	int getPoint(){ return point; }
    }

    int n, m;
    String s;
    boolean[][] times; // chara/time
    int[] points;
    Pop[] pop;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;

	    pop = new Pop[n];
	    times = new boolean[n][30];
	    points = new int[30];

	    for(int i=0; i<n; i++){
		s = sc.next();
		m = sc.nextInt();
		pop[i] = new Pop(s, i);
		for(int k=0; k<m; k++){
		    int t = sc.nextInt();
		    times[i][t] = true;
		    if(points[t]==0) points[t] = n;
		    else points[t]--;
		}
	    }

	    // テ」ツδ敕」ツつ、テ」ツδウテ」ツδ暗・ツ環?ァツョツ?
	    for(int i=0; i<n; i++)
		for(int k=0; k<30; k++)
		    if(times[i][k])
			pop[i].addPoint(points[k]);

	    // テ」ツつステ」ツδシテ」ツδ?
	    Arrays.sort(pop, new Comparator<Pop>(){
		    public int compare(Pop c1, Pop c2){
			int p1 = c1.getPoint();
			int p2 = c2.getPoint();
			if(p1!=p2) return p1-p2;
			String s1 = c1.getName();
			String s2 = c2.getName();
			return s1.compareToIgnoreCase(s2);
		    }
		}
		);
	    
	    //show();
	    System.out.println(pop[0].getPoint()+" "+pop[0].getName());
	}
    }

    void show(){
	for(int i=0; i<n; i++){
	    for(int k=0; k<30; k++)
		System.out.print(times[i][k] ? "o " : "x ");
	    System.out.println();
	}
	for(int i=0; i<30; i++)
	    System.out.print(points[i]+" ");
	System.out.println();
    }
}