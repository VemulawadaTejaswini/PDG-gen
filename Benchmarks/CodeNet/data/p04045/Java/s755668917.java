
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> Dlist = new ArrayList<>();
    for(int i=0; i<K; i++){
      Dlist.add((Integer)sc.nextInt());
    }
    for(int i=N;i < 1000000;i++){
      check: while(i/10 != 0){
          for(int D: Dlist){
            if(D== i%10){
              break check;
            }
          }
          i /=10;
        }
        System.out.println(i);
        break;
      }
    }
	}
