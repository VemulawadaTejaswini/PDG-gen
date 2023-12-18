import java.util.*;

public class Main {


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

        cities.get(0).remain = S;
        bfs(mins, cities, cities.get(0));

        for(int i=1;i<N;i++){
            System.out.println(mins[i]);
        }
    }

    public static void bfs(int[] mins, List<City> cities, City current){
        List<City> nextCurrent = new ArrayList<>();
        for (Next next:current.nexts){
            if(!next.visited) {
                if (current.remain >= next.cost) {
                    if(mins[next.city]!=0) {
                        if(mins[next.city]> mins[current.city] + next.time) {
                            mins[next.city] = mins[current.city] + next.time;
                            cities.get(next.city).remain = current.remain - next.cost;
                        }
                    }
                    else {
                        mins[next.city]=mins[current.city]+next.time;
                        cities.get(next.city).remain = current.remain - next.cost;
                    }

                } else {
                    int need = next.cost - current.remain;
                    int golden = (int) Math.ceil(need / (double) current.c);
                    int changeTime = golden * current.d;

                    if(mins[next.city]!=0) {
                        if(mins[next.city]> mins[current.city]+changeTime + next.time) {
                            mins[next.city] = mins[current.city]+changeTime + next.time;
                            cities.get(next.city).remain = golden * current.c - need;
                        }
                    }
                    else {
                        mins[next.city]=mins[current.city]+changeTime + next.time;
                        cities.get(next.city).remain = golden * current.c - need;
                    }
                }
                nextCurrent.add(cities.get(next.city));
                next.visited=true;
            }
        }

        for (City ncity:nextCurrent){
            bfs(mins, cities, cities.get(ncity.city));
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