import java.util.*;

class NRYS{

    public static void main(String[] args){



	Scanner sc = new Scanner(System.in);



	int n = sc.nextInt();


	int out,ten,rui;	
	String s;
	

	//	System.out.println("n = " + n);
	for(int i=0;i<n;i++){
	    out=0;
	    ten=0;
	    rui=0;
	    for(;true;){
		//	System.out.println("out = " + out);
		s = sc.next();
		if(s.equals("HIT")){
		    rui++;
		    if(rui>3){
			ten++;
			rui--;
		    }
		}
		else if(s.equals("HOMERUN")){
		    ten+=(rui+1);
		    rui=0;
		}
		else if(s.equals("OUT")){
		    out++;		
		    if(out >= 3)break;	    

		}
		
	


	    }
	System.out.println(ten);

	}




    }


}