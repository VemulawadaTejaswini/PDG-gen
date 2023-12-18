import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int x = s.nextInt();
    int y = s.nextInt();
    int z = s.nextInt();
    int k = s.nextInt();
    
    long[] as = new long[x];
    for (int i = 0; i < x; i++) {
      as[i] = s.nextLong();
    }
    Arrays.sort(as);
    
    long[] bs = new long[y];
    for (int i = 0; i < y; i++) {
      bs[i] = s.nextLong();
    }
    Arrays.sort(bs);
    
    long[] cs = new long[z];
    for (int i = 0; i < z; i++) {
      cs[i] = s.nextLong();
    }
    Arrays.sort(cs);
    
    PriorityQueue<Cake> q = new PriorityQueue<Cake>();
    HashSet<Cake> enqueued = new HashSet<Cake>();
    Cake maxCake = new Cake(x-1, y-1, z-1, as[x-1] + bs[y-1] + cs[z-1]);
    q.add(maxCake);
    enqueued.add(maxCake);
    
    for (int i = 0; i < k; i++) {
      Cake cake = q.poll();
      System.out.println(cake.totalScore);
      
      if (cake.aIndex-1 >= 0) {
        Cake nextCake = new Cake(cake.aIndex-1, cake.bIndex, cake.cIndex, as[cake.aIndex-1] + bs[cake.bIndex] + cs[cake.cIndex]);
        if (!enqueued.contains(nextCake)) {
          q.add(nextCake);
          enqueued.add(nextCake);
        }
      }
      if (cake.bIndex-1 >= 0) {
        Cake nextCake = new Cake(cake.aIndex, cake.bIndex-1, cake.cIndex, as[cake.aIndex] + bs[cake.bIndex-1] + cs[cake.cIndex]);
        if (!enqueued.contains(nextCake)) {
          q.add(nextCake);
          enqueued.add(nextCake);
        }
      }
      if (cake.cIndex-1 >= 0) {
        Cake nextCake = new Cake(cake.aIndex, cake.bIndex, cake.cIndex-1, as[cake.aIndex] + bs[cake.bIndex] + cs[cake.cIndex-1]);
        if (!enqueued.contains(nextCake)) {
          q.add(nextCake);
          enqueued.add(nextCake);
        }
      }
    }
  }
}

class Cake implements Comparable<Cake> {
  int aIndex;
  int bIndex;
  int cIndex;
  long totalScore;
  
  Cake(int aIndex, int bIndex, int cIndex, long totalScore) {
    this.aIndex = aIndex;
    this.bIndex = bIndex;
    this.cIndex = cIndex;
    this.totalScore = totalScore;
  }
  
  public boolean equals(Object object) {
    if (!(object instanceof Cake)) {
      return false;
    }
    Cake cake = (Cake)object;
    return this.aIndex == cake.aIndex && this.bIndex == cake.bIndex && this.cIndex == cake.cIndex;
  }
  
  public int hashCode() {
    int hashCode = aIndex;
    hashCode *= 1009;
    hashCode += bIndex;
    hashCode *= 1009;
    hashCode += cIndex;
    return hashCode;
  }
  
  public int compareTo(Cake cake) {
    if (cake.totalScore > this.totalScore) {
      return 1;
    }
    if (cake.totalScore < this.totalScore) {
      return -1;
    }
    return 0;
  }
}
