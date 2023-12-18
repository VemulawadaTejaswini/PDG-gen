import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int[] x = new int[n];
      int[] y = new int[n];
      for(int i=0;i<n;i++){
        x[i] = Integer.parseInt(sc.next());
        y[i] = Integer.parseInt(sc.next());
      }

      String s = "";
      for(int i=0;i<n;i++){
        s += String.valueOf(i);
      }
      //int cnt = 0;
      double ans = 0;
      while(true){
         int lng = s.length();
         //char[] c = new char[lng];
         int[] c = new int[lng];
         for(int i=0;i<lng;i++){
           c[i] = s.charAt(i);
           c[i] -= 48;
         }
         for(int i=1;i<lng;i++){
           int dx = x[c[i]] - x[c[i-1]];
           int dy = y[c[i]] - y[c[i-1]];
           double kyori = Math.sqrt((dx*dx)+(dy*dy));
           ans += kyori;
         }
         //cnt++;
	       s = nextPermutation(s);
         if (s.equals("Final")) break;
      }
      for(int i=1;i<=n;i++){
        ans /= i;
      }
       System.out.println(ans);
    }

    public static String nextPermutation (String s) {

	     ArrayList<Character> list = new ArrayList<>();
	     for(int i=0;i<s.length();i++){
         list.add(s.charAt(i));
       }

       int pivotPos = -1;
       char pivot = 0;
       for(int i=list.size()-2;i>=0;i--){
         if(list.get(i)<list.get(i+1)){
           pivotPos = i;
           pivot = list.get(i);
           break;
		     }
	     }

        if(pivotPos==-1 && pivot==0){
          return "Final";
        }

        int L = pivotPos+1, R = list.size()-1;
        int minPos = -1;
        char min = Character.MAX_VALUE;
        for(int i=R;i>=L;i--){
          if(pivot<list.get(i)){
            if(list.get(i)<min){
              min = list.get(i);
              minPos = i;
			       }
		       }
	      }

	       Collections.swap(list, pivotPos, minPos);
	       Collections.sort(list.subList(L, R+1));

	       StringBuilder sb = new StringBuilder();
         for(int i=0;i<list.size();i++){
           sb.append(list.get(i));
         }

         return sb.toString();
    }

}
