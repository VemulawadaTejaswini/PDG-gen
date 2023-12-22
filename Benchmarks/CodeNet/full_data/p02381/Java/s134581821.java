import java.util.*;
 
class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Double> sList = new ArrayList<>();
    	ArrayList<Double> devList = new ArrayList<>();
    	ArrayList<Double> sigmaList = new ArrayList<>();
    	
    	int n = 999;
    	double s;
    	double sum = 0;;
    	double avg;
    	double disp = 0;
    	double sigma;
    	int cnt = 0;
    	while(n != 0) {
    		n = sc.nextInt();
    		if(n == 0) {
    			break;
    		} else {
       			//ArrayList?????????
    			for(int i = 0; i < n; i++) {
    	    		sList.add(0.0);
    	    		devList.add(0.0);
    	    	}
    			//???????????\???
    	    	for(int i = 0; i < n; i++) {
    	    		s = sc.nextDouble();
    	    		sList.set(i, s);
    	    	}
    	    	//????¨?
    	    	for(int i = 0; i < n; i++) {
    	    		sum = sList.get(i) + sum;
    	    	}
    	    	//??????
    	    	avg = sum / n;
    	    	//??????
    	    	for(int i = 0; i < n; i++) {
    	    		devList.set(i, Math.abs(sList.get(i) - avg));
    	    	}
    	    	//?????£
    	    	for(int i = 0; i < n; i++) {
    	    		disp = devList.get(i) * devList.get(i) + disp;
    	    	}
    	    	disp = disp / n;
    	    	//?¨??????????
    	    	sigma = Math.sqrt(disp);
    	    	sigmaList.add(sigma);
    	    	cnt++;
    		}
    		sum = 0;
    		avg = 0;
    		disp = 0;
    		sigma = 0;
    	}
    	for(int i = 0; i < cnt; i++) {
    		System.out.println(sigmaList.get(i));
    	}
    }
}