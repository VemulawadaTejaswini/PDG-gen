import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] lines = br.readLine().split(" ");
	    int n = Integer.parseInt(lines[0]);
	    int m = Integer.parseInt(lines[1]);
	    ArrayList<Station> stationList = new ArrayList<Station>();
	    for(int i=1;i<=m;i++){
	        stationList.add(new Station(i));
	    }
	    
	    for(int i=0;i<n;i++){
	        lines = br.readLine().split(" ");
	        int from = Integer.parseInt(lines[0]);
	        int to   = Integer.parseInt(lines[1]);
	        int cost = Integer.parseInt(lines[2]);
	        int time = Integer.parseInt(lines[3]);
	        Station s_from = stationList.get(from-1);
	        Station s_to   = stationList.get(to-1);
	        s_from.setNext(s_to,new Node(cost,time));
	        s_to.setNext(s_from,new Node(cost,time));
	    }
	    int num = Integer.parseInt(br.readLine());
	    for(int i=0;i<num;i++){
	        lines = br.readLine().split(" ");
	        int from = Integer.parseInt(lines[0]);
	        int to   = Integer.parseInt(lines[1]);
	        int prm  = Integer.parseInt(lines[2]);
	        Station s_from = stationList.get(from-1);
	        Station s_to   = stationList.get(to-1);
	        
	        System.out.println(calcCost(s_from,s_to,prm));
	    }
		//System.out.println(line);
	}
	public static class Station{
	    int staNo;
	    HashMap<Station,Node> next = new HashMap<Station,Node>();
	    public  Station(int no){
	        this.staNo = no;
	    }
	    public void setNext(Station station, Node node){
	        this.next.put(station,node);
	    }
	    public HashMap<Station,Node> getNext(){
	        return this.next;
	    }
	}
    public static class Node{
        int cost;
        int time;
        public  Node(int cost,int time){
            this.cost = cost;
            this.time = time;
        }
        public int getCost(int param){
            switch(param){
            case 0:
                return cost;
            case 1:
                return time;
            }
            return 0;
        }
    }
    
    public static int calcCost(Station from,Station to,int prm){
        HashMap<Station,Integer> costMap = new HashMap<Station,Integer>();
        ArrayList<Station> nows = new ArrayList<Station>();
        nows.add(from);
        costMap.put(from,0);
        
        while(nows.size()>0){
            ArrayList<Station> nextList = new ArrayList<Station>();
            for(Station now:nows){
                Set<Station> nexts = now.getNext().keySet();
                for(Station next:nexts){
                    int cost = now.getNext().get(next).getCost(prm) + costMap.get(now);
                    
                    if(costMap.containsKey(next)){
                        if(costMap.get(next)>cost){
                            costMap.put(next,cost);
                            nextList.add(next);
                        }
                    }else{
                        nextList.add(next);
                        costMap.put(next,cost);
                    }
                }
            }
            nows = nextList;
        }
        return costMap.get(to)!=null?costMap.get(to):0;
    }
}