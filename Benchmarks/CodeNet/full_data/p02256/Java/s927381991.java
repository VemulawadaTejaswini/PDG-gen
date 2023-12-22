import java.util.Scanner;
class Main{
    public static void main(String[] args){
	int x,y,i,max=0;
	
	Scanner scan = new Scanner(System.in);
	x = scan.nextInt();
	y = scan.nextInt();
	
	if(x>=y){
	    for(i=2;i<=y;i++){
		if((x%i)==0){
		    if((y%i==0)){max=i;}
		}
	    }
	}
	else{
	    for(i=2;i<=x;i++){
		if(y%i==0){
		if(x%i==0){max=i;}
		}
	    }
	}
	System.out.println(max);
    }
}

