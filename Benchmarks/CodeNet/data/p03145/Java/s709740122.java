import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x[] = new int[3];
        for(int i=0; i<3; i++){
            x[i] = sc.nextInt();
        }
        System.out.println(x[0] * (x[1]/2));
        
    }
}
