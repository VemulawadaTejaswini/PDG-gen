import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] pqcs = new int[M][3];
    for(int i=0;i<M;i++) {
      pqcs[i][0] = scanner.nextInt();
      pqcs[i][1] = scanner.nextInt();
      pqcs[i][2] = scanner.nextInt();
    }

    PriorityQueue<State> pq = new PriorityQueue<State>();
    HashMap<Integer, Integer> stationToFare = new HashMap<>();
    stationToFare.put(1, 0);
    for(int[] pqc : pqcs) {
      if(pqc[0] == 1) {
        pq.add(new State(pqc[1], 1, pqc[2]));
        stationToFare.put(pqc[1], 1);
      }
      if(pqc[1] == 1) {
        pq.add(new State(pqc[0], 1, pqc[2]));
        stationToFare.put(pqc[0], 1);
      }
    }
    while(!pq.isEmpty()) {
      State s = pq.remove();
//      System.out.println(s);
      for(int[] pqc : pqcs) {
        if(pqc[0] == s.station) {
          int fare = (pqc[2]==s.company)? s.fare : s.fare + 1;
          if(stationToFare.get(pqc[1]) != null && stationToFare.get(pqc[1]) <= fare) {
            continue;
          }
//          System.out.println(String.format("st.%d => %d", pqc[1], fare));
          stationToFare.put(pqc[1], fare);
          pq.add(new State(pqc[1], fare, pqc[2]));
        } else if(pqc[1] == s.station) {
          int fare = (pqc[2]==s.company)? s.fare : s.fare + 1;
          if(stationToFare.get(pqc[0]) != null && stationToFare.get(pqc[0]) <= fare) {
            continue;
          }
//          System.out.println(String.format("st.%d => %d", pqc[0], fare));
          stationToFare.put(pqc[0], fare);
          pq.add(new State(pqc[0], fare, pqc[2]));
        }
      }
    }
    Integer finalFare = stationToFare.get(N);
//    System.out.println(finalFare==null? -1 : finalFare);

    scanner.close();
  }

  private static class State implements Comparable<State> {
    int station;
    int fare;
    int company;
    public State(int s, int f, int c) {
      station = s;
      fare = f;
      company = c;
    }

    public int compareTo(State another) {
      return this.fare - another.fare;
    }

    public String toString() {
      return String.format("st.%d, fare.%d, com.%d", station, fare, company);
    }
  }
}
