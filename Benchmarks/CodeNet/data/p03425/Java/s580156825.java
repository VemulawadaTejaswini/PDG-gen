import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
                long m = 0;
                long a = 0;
                long r = 0;
                long c = 0;
                long h = 0;
                long n = 0;
                String S[] = new String [N];
                for(int i=0;i<N;i++){
                      S[i] = String.valueOf(sc.next().charAt(0));
                      if(S[i].equals("M"))
                             m++;
                      else if(S[i].equals("A"))
                             a++;
                      else if(S[i].equals("R"))
                             r++;
                      else if(S[i].equals("C"))
                             c++;
                      else if(S[i].equals("H"))
                             h++;
                 }
                 


//		System.out.println(m + " " + a + " "+ r + " "+ c + " "+ h );
               n =  m*a*r+m*a*c+m*a*h+m*r*c+m*r*h+m*c*h+a*r*c+a*r*h+a*c*h+r*c*h ;

               System.out.println(n);
	}
}