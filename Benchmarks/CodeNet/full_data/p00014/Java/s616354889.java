import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){

	    int d = sc.nextInt();
	    
	    List<Integer> f = new ArrayList<Integer>();
	    for(int i=0;; i++){
		if(d*(i+1)<=600-d){
		    f.add((d*(i+1))*(d*(i+1))*d);
		}else{break;}
	    }
	    
	    int sum = 0;
	    for(int i=0; i<f.size(); i++){
		sum += f.get(i);
	    }
	    
	    System.out.println(sum);
	}
    }
}