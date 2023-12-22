import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(sc.hasNext()) {
                int d = sc.nextInt();
                double e = sc.nextInt();
                if(d+e == 0)break;
                
                double val = e;
                if(d>e)
                	val = d;
                for(int x=0;x<=d;x++) {
                	int y=d-x;
                	if(Math.abs(Math.sqrt(x*x+y*y)-e)<val)
	                		val = Math.min(Math.abs(Math.sqrt(x*x+y*y)-e),val);
                }
                System.out.println(val);
            }
        }
    }
}

