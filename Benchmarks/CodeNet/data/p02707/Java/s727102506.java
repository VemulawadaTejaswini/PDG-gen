import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a-1];
        for(int i=0;i<a-1;i++){
                               int b = sc.nextInt();
                               in[b-1]++;
                            }
		
        for(int i=0;i<a;i++){System.out.println(in[i]);
                                                 
                            }
       
		
	}
}
