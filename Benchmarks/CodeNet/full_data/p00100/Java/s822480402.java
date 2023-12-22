import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    while(true){
		int in = s.nextInt();
		if(in==0)break;
		long data[][] = new long[in][3];
		for(int i=0 ; i<in ; i++){
		    for(int j=0 ; j<3 ; j++)
		    data[i][j] = s.nextInt();
		}
		boolean flag = false;
		for(int i=0 ; i<in ; i++){
		    if(data[i][1]*data[i][2] >= 1000000){
			System.out.println(data[i][0]);
			flag = true;
		    }
		}
		if(flag==false)
		    System.out.println("NA");
	    }
      	}
}