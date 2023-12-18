import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		long con =0;

		for(int i=0; i<n; i++){
			for(int j=(i+1); j<n; j++){
				for(int k =(j+1); k<n; k++){
                  if(str.charAt(i)==str.charAt(j))break;
					if( str.charAt(i)!=str.charAt(k) && str.charAt(j)!=str.charAt(k)){
						if(j-i != k-j)con ++;
					}
				}
			}
		}
		System.out.println(con);
		
	}
}