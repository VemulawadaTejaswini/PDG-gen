import java.util.Scanner;
import java.util.ArrayList; 

class Calc{
    void solve(ArrayList<ArrayList<Long>> a,ArrayList<String> s,int t){
	for(int i=0;i<t;i++){
	    int w = 0;
	    //System.out.println(s.get(i).length());
	    for(int j=0;j<s.size();j++){
		//System.out.println(a);
		//System.out.println(s.get(j));
		//System.out.println(s.get(j).length()-1);
		for(int k=s.get(i).length()-1;k>=0;k--){
		    //System.out.println(a.get(i).size());
		    //System.out.println(s.get(i).charAt(k));
		    if(s.get(i).charAt(k)=='0'){
			//System.out.println("0のターン");
			if(a.get(i).get(k)==1){
			    break;
			}
		    }else{
			//System.out.println("1のターン");
			if(a.get(i).get(k)==1){
			    w = 1;
			    break;
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
	//System.out.println("t?");
	int t = sc.nextInt();
	ArrayList<ArrayList<Long>>ai = new ArrayList<>();
	ArrayList<String> p = new ArrayList<>();
	for(int i=0;i<t;i++){
	    ai.add(new ArrayList<Long>());
	    //System.out.println("n?");
	    int n = sc.nextInt();
	    for(int j=0;j<n;j++){
		//System.out.println("ai?");
		ai.get(i).add(sc.nextLong()%2);
	    }
	    //System.out.println("s?");
	    p.add(sc.next());
	}
	Calc calc = new Calc();
	calc.solve(ai,p,t);
	sc.close();
      }
}
