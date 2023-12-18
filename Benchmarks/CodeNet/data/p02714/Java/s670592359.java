import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
		String st = sc.next();
      	char [] S = st.toCharArray();
		int sum =0;
		for(int i=0;i<N;i++){
          for(int j=1;j<N;j++){
            for(int k=2;j<N;j++){
			if(j-i!=k-j){
              if(S[i]!=S[J]&&S[i]!=S[k]){
              if(S[j]!=S[k]){
                sum+=1
              	}
              }
            }
       		}
          }
        }
      System.out.println(sum);
	}
}