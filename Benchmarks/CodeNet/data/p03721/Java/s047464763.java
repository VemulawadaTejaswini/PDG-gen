import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
        Long b = sc.nextLong();
        Long c = b-b;
        int ans = 0;
        int d;
		double [] in1 = new double [a];
        int f,g;      
        for(int i=0;i<a;i++){f = sc.nextInt();
                             g = sc.nextInt();
                             in1[i] = d+ge-6;                           
                            }
		Arrays.sort(in1);       		
        for(int i=0;i<a;i++){d = Math.floor(in1[i]);
                             c+=(in1[i]-d)*1000000;
                             if(c>=b){ans=d;break;}
                            }                                                      
		System.out.println(ans);
	}
}
