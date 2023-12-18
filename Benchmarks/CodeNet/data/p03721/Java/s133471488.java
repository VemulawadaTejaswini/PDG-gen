    import java.util.*;
     
    public class Main {
      public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
     
        String[] param = scan.nextLine().split(" ");
     
        long n = Long.parseLong(param[0]);
        long k = Long.parseLong(param[1]);
     
        ArrayList<Element> e = new ArrayList<Element>();
     
        for (int i = 0; i < n ; i++){
            String[] elem = scan.nextLine().split(" ");
            e.add(new Element(Long.parseLong(elem[0]), Long.parseLong(elem[1]) ) );
        }
     
        Collections.sort(e);
     
        long minNum = 0;
        long m = 0;
     
        for (Element el : e) {
            if (m < k && m + el.b >= k){
              minNum = el.a;
            }
            m += el.b;
        }
     
        System.out.println(minNum);
      }
     
    }
     
     class Element implements Comparable<Element> {
        public long a;
        public long b;
     
        public Element (long a, long b){
          this.a = a;
          this.b = b;
        }
     
        public int compareTo (Element e) {
          return this.a > e.a ? +1 : this.a < e.a ? -1 : 0;
        }
      }