import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		int [] in = new int [a];       
        for(int i=0;i<a;i++){int c = sc.nextInt();
                             int d = sc.nextInt();
                             in[c-1]++;
                             in[d-1]++;
                            }
		
        for(int i=0;i<a;i++){if(in[i]==0){ans++;
                                                 }
                            }
     
		System.out.println(ans);
	}
}