import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

      ArrayList<int[]>[] ps = new ArrayList[m+1];
      for(int i = 0; i < ps.length; i++)
        ps[i] = new ArrayList<>();

      for(int i = 1; i <= m; i++) {
        int pNum = sc.nextInt();
        int year = sc.nextInt();
        ps[pNum].add(new int[]{year, i});
      }

          
      for(ArrayList<int[]> pp : ps) {
        Collections.sort(pp, (a, b) -> a[0] - b[0]);
      }

      String[] cities = new String[m+1];
      for(int i = 1; i < ps.length; i++) {
        ArrayList<int[]> pp = ps[i];
        
        for(int k = 0; k < pp.size(); k++) {
            
          StringBuilder sb = new StringBuilder();
          String pStr = String.valueOf(i);
          for(int j = 0; j < 6 - pStr.length(); j++)
            sb.append("0");
          sb.append(pStr);

          pStr = String.valueOf(k+1);
          for(int j = 0; j < 6 - pStr.length(); j++)
            sb.append("0");
          sb.append(k+1);

          cities[pp.get(k)[1]] = sb.toString();
        }
      }
      
      for(int i = 1; i < cities.length; i++)
       System.out.println(cities[i]);
  }
}