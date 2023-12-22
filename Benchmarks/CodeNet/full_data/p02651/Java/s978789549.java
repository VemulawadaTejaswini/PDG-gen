import java.util.Scanner;
import java.util.ArrayList; 

class Calc{
    void solve(ArrayList<ArrayList<Long>> a,ArrayList<String> s,int t){
	for(int i=0;i<t;i++){
	    int w = 0;
	    for(int j=0;j<s.size();j++){
		for(int k=s.get(j).length()-1;k>=0;k--){
		    if(s.get(j).charAt(k)=='0'){
			if(w==1&&a.get(i).get(k)==1){
			    w = 0;
			}
		    }else{
			if(1==0&&a.get(i).get(k)==0){
			    w = 1;
			}
		    }
		}
	    }
	    System.out.println(w);
	}
    }
}

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	ArrayList<Long> ai = new ArrayList<>();
	ArrayList<ArrayList<Long>>ai2 = new ArrayList<>();
	ArrayList<String> p = new ArrayList<>();
	for(int i=0;i<t;i++){
	    int n = sc.nextInt();
	    for(int j=0;j<n;j++){
		ai.add(sc.nextLong()%2);
	    }
	    ai2.add(ai.clone());
	    for(int j=0;j<n;j++){
		p.add(sc.next());
	    }
	    ai.clear();
	}
	Calc calc = new Calc();
	calc.solve(ai2,p,t);
	sc.close();
      }
}
