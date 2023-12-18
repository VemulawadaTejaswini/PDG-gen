import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int n = sc.nextInt();
      	boolean con = true;
      
      	n *= 100;
      	for(int i = 0; i < 99 && con;i++){
        	if(((n + i)%108) == 0){
              n = (n+i)/108;
              con = false;
            }
        }	
      
      	if(!con) System.out.println(n);
      	else System.out.println(":(");
        
	}
}
