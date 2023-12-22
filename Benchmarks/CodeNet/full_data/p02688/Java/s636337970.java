import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
        int k = sc.nextInt();
        int [] in = new int [n];
        for(int i=0;i<k;i++){int a = sc.nextInt();
                             for(int j=0;j<a;j++){int b = sc.nextInt();
                                                 if(in[b]==0){in[b]++;}
                                                 }
                            }
        for(int i=0;i<n;i++){n-=in[i];
                              }
		System.out.println(n);
	}
}
