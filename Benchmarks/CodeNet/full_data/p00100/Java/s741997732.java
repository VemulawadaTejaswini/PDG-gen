import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n;
	while((n=scan.nextInt())!=0){
	    boolean check=false;
	    for(int i=0;i<n;i++){
		int name=scan.nextInt();
		if(1000000.0<=scan.nextDouble()*scan.nextDouble()){
		    System.out.println(name);
		    check=true;
		}
	    }
	    if(!check)System.out.println("NA");
	}
    }
}