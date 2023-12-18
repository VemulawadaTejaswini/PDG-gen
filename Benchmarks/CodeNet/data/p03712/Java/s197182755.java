import java.util.*;
  
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String a[] = new String [H];
		String x = "";
  
		for(int i=0; i<H; i++) {
			a[i] = sc.next();
		}

		for(int i=0; i<W; i++){
			x += "#"; 
		}


		System.out.println("#"+x+"#");
		for(String j:a){
            System.out.println("#"+j+"#");       
		}
		System.out.println("#"+x+"#");
	

		
	}
}



