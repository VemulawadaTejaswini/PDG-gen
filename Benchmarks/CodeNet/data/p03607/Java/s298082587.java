import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [1000000000];
        int b = 0;
        int c;
        for(int i=0;i<a;i++){c = sc.nextInt();
                             in[c-1]++;
                             if(in[c-1]%2==1){b++;}
                             else{b--;}
                            }		
		System.out.println(b);
	}
}
