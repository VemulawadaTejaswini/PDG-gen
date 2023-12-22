import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        int ans = 0;       
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                             if(i%2==0 && in[i]%2==1){ans++;}
                            }
		
		System.out.println(ans);
	}
}
