import java.io.*;
import java.util.*;

class Main {
 public static void main(String args[]) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   StringTokenizer st = new StringTokenizer(br.readLine());
   int N = Integer.parseInt(st.nextToken());
   int M = Integer.parseInt(st.nextToken());
   
   List<Set<Integer>> list = new ArrayList<Set<Integer>>();
   
   for(int i=0;i<M;i++) {
     st = new StringTokenizer(br.readLine());
     int a = Integer.parseInt(st.nextToken());
     int b = Integer.parseInt(st.nextToken());
   	 List<Set<Integer>> tmpList = new LinkedList<Set<Integer>>();
   	 boolean flag = false;
     for(int j=0;j<list.size();j++) {
       	 Set<Integer> tmpSet = list.get(j);
       	 if(tmpSet.contains(a) && tmpSet.contains(b)) {
       	     flag = true;
       	     break;
       	 }
      	 if(tmpSet.contains(a) || tmpSet.contains(b)) {
          	tmpList.add(tmpSet);
          	list.remove(tmpSet);
         }
     }
     if(flag)
        continue;
     Set<Integer> tSet = new HashSet<Integer>();
     if(tmpList.size() > 0) {
       for(int j=0;j<tmpList.size();j++) {
         tSet.addAll(tmpList.get(j));
       }
     }
     tSet.add(a);
     tSet.add(b);
     list.add(tSet);
   }
   int ans = 0;
   for(int i=0;i<list.size();i++) {
    int size = list.get(i).size();
     if(size > ans)
       ans = size;
   }
   
   System.out.println(ans);
   
 }
}