import java.util.*;
class Main {
    static int diagonal;
    public static void main (String []args){
	Scanner sc = new Scanner(System.in);
	int h = sc.nextInt();
	int w = sc.nextInt();
	while(h > 0 && w > 0){
	    diagonal = h*h + w*w;
	    printResult(h,w);
	    h = sc.nextInt();
	    w = sc.nextInt();
	}
    }
    static void printResult(int height,int width){
	boolean isfirst = true;
	while(diagonal < 150*150+150*150){
	    if(isfirst){
		for(int h=height+1;h<150;h++){
		    for(int w=h+1;w<150;w++){
			if((h*h+w*w)==diagonal) {
			    System.out.println(h +" " + w);
			    return;
			}
		    }
		}
		isfirst = false;
	    }else{
		for(int h=1;h<150;h++){
		    for(int w=h+1;w<150;w++){
			if((h*h+w*w)==diagonal) {
			    System.out.println(h +" " + w);
			    return;
			}
		    }
		}
	    }
	    diagonal++;
	}
    }	
}