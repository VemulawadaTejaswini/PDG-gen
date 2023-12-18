import java.util.*;

class ABC_155C{
  static void printArray(String [] a){
      char c = '[';
      for(int i = 0; i < a.length; i++){
        System.out.print(c + a[i]);
        c = ',';
      }
      System.out.println("]");
    }
  static void printArray(int [] a){
      String c = "[";
      for(int i = 0; i < a.length; i++){
        System.out.print(c + a[i]);
        c = ",";
      }
      System.out.println("]");
    }
    static void sort(String[] s, int[] count){
      for(int i = 0; i < s.length; i++){
        for(int j = i+1; j < s.length; j++){
          if(count[i] < count[j]){
            int t = count[i];
            count[i] = count[j];
            count[j] = t;
            String u = s[i];
            s[i] = s[j];
            s[j] = u;
          }
          if(count[i] == count[j] && count[i] != 0){
          if (s[i].compareTo(s[j]) > 0) {
              int t = count[i];
              count[i] = count[j];
              count[j] = t;
              String u = s[i];
              s[i] = s[j];
              s[j] = u;
          }
          }
        }
      }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        String s[] = new String [n];
        int count[] = new int [n];
        for(int i = 0; i < n; i++){
          s[i] = stdIn.next();
          count[i] = 0;
          for(int j = 0; j <= i; j++){
            if(s[i].equals(s[j])) {count[j]++; break;}
          }
        }

       sort(s,count);
       int max = count[0];
       for(int i = 0; i < n; i++){
         if(max != count[i]) break;
         System.out.println(s[i]);
       }
        
    }
}

