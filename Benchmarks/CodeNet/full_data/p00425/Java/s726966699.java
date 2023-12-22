import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n;
    	int ue,mae,migi,reg,sum;
    	String s;
    	for(;;){
    		sum=1;
    		ue=1;
    		mae=2;
    		migi=3;
    		n=sc.nextInt();
    		if(n==0){
    			return;
    		}
    		for(int i=0;i<n;i++){
    			s=sc.next();
    			switch(s){
    			    case "North":
    				    reg=ue;
    				    ue=mae;
    				    mae=7-reg;
    				    break;
    			    case "East":
    			    	reg=migi;
    			    	migi=ue;
    			    	ue=7-reg;
    			    	break;
    			    case "West":
    			    	reg=ue;
    			    	ue=migi;
    			    	migi=7-reg;
    			    	break;
    			    case "South":
    			    	reg=mae;
    			    	mae=ue;
    			    	ue=7-reg;
    			    	break;
    			    case "Right":
    			    	reg=mae;
    			    	mae=migi;
    			    	migi=7-reg;
    			    	break;
    			    case "Left":
    			    	reg=migi;
    			    	migi=mae;
    			    	mae=7-reg;
    			    	break;
    			}
    			sum+=ue;
    		}
    		System.out.println(sum);
    	}
    }
}
