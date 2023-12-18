import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    List<> P = new ArrayList<>();
    List<> Q = new ArrayList<>();
    List<> Ps = new ArrayList<>();
    List<> Qs = new ArrayList<>();   
    int a = 0; 
    int b = 0;
    for(int i=0; i<N; i++){
    	int x = sc.nextInt();
        P.add(x);
        Ps.add(x);
    }
    for(int i=0; i<N; i++){
    	int x = sc.nextInt();
        Q.add(x);
        Qs.add(x);
    } 
    Arrays.sort(Ps);
    Arrays.sort(Qs);
      
   for(int i=0; i<N-1;i++){
     int searchNumber = P.get(i);
     int x = 0;
     int y = 1;
     for(int j=0; j<Ps.size(); j++){
     	if(searchNumber == Ps.get(j)){
          x = j;
          Ps.remove(j);
          break;
        }
     }
   for( int i = (N - i - 1); i > 0; i--) y *= i;
   if(x != 0) a = x * y;
   }
      
   for(int i=0; i<N-1;i++){
     int searchNumber = Q.get(i);
     int x = 0;
     int y = 1;
     for(int j=0; j<Qs.size(); j++){
     	if(searchNumber == Qs.get(j)){
          x = j;
          Qs.remove(j);
          break;
        }
     }
   for( int i = (N - i - 1); i > 0; i--) y *= i;
   if(x != 0) a = x * y;
   }
      
	if(a == 0) a =1;
    if(b == 0) b =1;
      
   int answer = a - b;
   if(answer < 0) answer = -answer;
   System.out.println(answer);   
    }
}
