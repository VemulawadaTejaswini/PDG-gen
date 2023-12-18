package atcoder;

import java.util.*;

public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // get a integer
//        int s = sc.nextInt();
//        // get two integers separated with half-width break
//        int w = sc.nextInt();
//        String str = (s <= w) ? "unsafe" : "safe";
//        System.out.println(str);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//
//        String r="";
//
//        while(c>0 && a>0){
//            c-= b;
//            if(c<=0) {
//                r="Yes";
//                break;
//            }
//            a-=d;
//            if(a<=0) {
//                r="No";
//                break;
//            }
//        }
//
//        System.out.println(r);
//    }

//    public static void main(String[] args) {
//        int r =0;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        HashSet hs = new HashSet<>();
//        for(int i=0;i<n;i++){
//            hs.add(sc.next());
//        }
//        System.out.println(hs.size());
//    }

    public static void main(String[] args) {
        int r =0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt(); // 银

        List<City> cities = new ArrayList<>();
        for(int n=0;n<N;n++){
            cities.add(new City(n));
        }
        // path
        for(int m=0;m<M;m++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a= sc.nextInt();
            int b = sc.nextInt();

            cities.get(u-1).nexts.add(new Next(v-1,a,b));
            cities.get(v-1).nexts.add(new Next(u-1,a,b));
        }

        // city exchanger
        for (int n=0;n<N;n++){
            cities.get(n).c=sc.nextInt();
            cities.get(n).d=sc.nextInt();
        }

        int[] mins = new int[N];
        mins[0]=0;

        bfs(mins, cities, cities.get(0), S);

        System.out.println();
    }

    public static void bfs(int[] mins, List<City> cities, City current, int S){
        List<City> nextCurrent = new ArrayList<>();
        for (Next next:current.nexts){
            if(!next.visited) {
                if (S >= next.cost) {
                    if(mins[next.city]!=0) mins[next.city] = Math.min(mins[next.city], next.time) ;
                    else mins[next.city]=next.time;
                    cities.get(next.city).remain = S - next.cost;
                } else {
                    int need = next.cost - S;
                    int golden = (int) Math.ceil(need / (double) current.c);
                    int changeTime = golden * current.d;
                    cities.get(next.city).remain = golden * current.c - need;
                    if(mins[next.city]!=0) mins[next.city] = Math.min(mins[next.city], changeTime + next.time) ;
                    else  mins[next.city]=changeTime + next.time;
                }
                nextCurrent.add(cities.get(next.city));
                next.visited=true;
            }
        }
        for(City nextCurrentCity: nextCurrent) {
            bfs(mins, cities, nextCurrentCity, S);
        }
    }
}

class City {
    int city;
    int c;
    int d;
    int remain; // 0 to city remained money.
    List<Next> nexts;

    City(int n){
        this.city=n;
        nexts=new ArrayList<>();
    }
    City(int city, int c, int d){
        this.city = city;
        this.c = c;
        this.d = d;
        nexts=new ArrayList<>();
    }
}

class Next {
    int city;
    int cost;
    int time;
    boolean visited;

    Next(int city, int cost, int time){
        this.city = city;
        this.cost = cost;
        this.time = time;
    }
}