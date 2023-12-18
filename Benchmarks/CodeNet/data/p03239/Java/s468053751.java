import java.io.*;
import java.util.*;
class Pair implements Comparable<Pair>{
    int cost, time;
    Pair(int cost, int time){
        this.cost = cost;
        this.time = time;
    }
    public int compareTo(Pair other){
        return this.cost-other.cost;
    }
}
class Main{
    public static void main(String[] args) {
        //Program obj = new Program();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); int T = in.nextInt();
        ArrayList<Pair> arr = new ArrayList<>();
        while(N-->0){
            arr.add(new Pair(in.nextInt(),in.nextInt()));
        }
        in.close();
        Collections.sort(arr);
        boolean flag = true;
        for(int i=0;i<arr.size();i++){
            if (arr.get(i).time<=T) {
                System.out.println(arr.get(i).cost);
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("TLE");
    }
}