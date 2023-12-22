import  java.util.*;
class Main{
    int tate,yoko,takasa;
    int n;
    int r;
    
    Main(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    tate=sc.nextInt();
	    yoko=sc.nextInt();
	    takasa=sc.nextInt();
	    if(tate==0 && yoko==0 && takasa==0){
		break;
	    }
	
	    n=sc.nextInt();

	    for(int i=0; i<n; i++){
		r=sc.nextInt();
		if((tate*tate)+(yoko*yoko)<r*2*2*r || (tate*tate)+(takasa*takasa)<r*2*2*r || (takasa*takasa)+(yoko*yoko)<r*2*2*r){
		    System.out.println("OK");
		}else{
		    System.out.println("NA");
	       	}
	    }
	   
	}
    }

    public static void main(String[] args){
	new Main();
    }
}