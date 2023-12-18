import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      ArrayList<Integer> R = new ArrayList<>(); 
      ArrayList<Integer> G = new ArrayList<>(); 
      ArrayList<Integer> B = new ArrayList<>();
      for(int i=0;i<S.length();i++){
        if(S.charAt(i)=='R'){
          R.add(i);
        }else if(S.charAt(i)=='G'){
          G.add(i);
        }else{
          B.add(i);
        }
      }
      int ans = 0;
      for(int i=0;i<R.size();i++){
        for(int j=0;j<G.size();j++){
          for(int k=0;k<B.size();k++){
            int[] ijk = {R.get(i),G.get(j),B.get(k)};
            Arrays.sort(ijk);
            if(ijk[1]-ijk[0]!=ijk[2]-ijk[1]){
              ans++;
            }
          }
        }
      }
      System.out.println(ans);
    }
}