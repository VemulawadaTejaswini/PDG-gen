import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        ArrayList<Integer> A = new ArrayList<>();
       
        for(int i = 0; i < N; i++){
          a[i] = sc.nextInt();
        }
        
       for(int i = 0; i < N; i++){
         if(A.contains(a[i]) == false){
           A.add(a[i]);
         }else{
           System.out.println("NO");
           return;
         }
       }
       
       System.out.println("YES");
      
	}

}



