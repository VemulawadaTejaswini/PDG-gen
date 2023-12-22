import java.util.*;

/**
 * Created by huzhejie on 2016/10/10.
 */
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        State initState = new State();
        PriorityQueue<State> queue = new PriorityQueue<State>();
        Scanner sc = new Scanner(System.in);
        String s = null;
        int count = 0;
        while (count<3){
            s = sc.nextLine();
            String str[] = s.split(" ");
            initState.map.put(Integer.parseInt(str[0]),new Coordinate(1,count+1));
            initState.map.put(Integer.parseInt(str[1]),new Coordinate(2,count+1));
            initState.map.put(Integer.parseInt(str[2]),new Coordinate(3,count+1));
            initState.step = 0;
            count++;
        }
        queue.add(initState);
        int step = 0;
        while(!queue.isEmpty()){
            State state = queue.poll();
            queue.clear();
            Coordinate zero = state.map.get(0);
            int bottomValue=state.getBottomNodeValue(zero);
            int topValue = state.getTopNodeValue(zero);
            int leftValue = state.getLeftNodeValue(zero);
            int rightValue = state.getRightNodeValue(zero);
            step++;
            if(bottomValue!=-1){
                State tempState = new State();
                for(int i:state.map.keySet())
                tempState.map.put(i,state.map.get(i).clone());
                tempState.map.get(bottomValue).y = tempState.map.get(bottomValue).y-1;
                tempState.map.get(0).y = tempState.map.get(0).y+1;
                tempState.step = step;
                if(tempState.calculate(tempState.map)!=0)
                   queue.add(tempState);
                else {
                    System.out.println(tempState.step);
                    break;
                }
            }
            if(topValue!=-1){
                State tempState = new State();
                for(int i:state.map.keySet())
                    tempState.map.put(i,state.map.get(i).clone());
                tempState.map.get(topValue).y = tempState.map.get(topValue).y+1;
                tempState.map.get(0).y = tempState.map.get(0).y-1;
                tempState.step = step;
                if(tempState.calculate(tempState.map)!=0)
                    queue.add(tempState);
                else {
                    System.out.println(tempState.step);
                    break;
                }
            }
            if(rightValue!=-1){
                State tempState = new State();
                for(int i:state.map.keySet())
                    tempState.map.put(i,state.map.get(i).clone());
                tempState.map.get(rightValue).x = tempState.map.get(rightValue).x-1;
                tempState.map.get(0).x = tempState.map.get(0).x+1;
                tempState.step = step;
                if(tempState.calculate(tempState.map)!=0)
                    queue.add(tempState);
                else {
                    System.out.println(tempState.step);
                    break;
                }
            }
            if(leftValue!=-1){
                State tempState = new State();
                for(int i:state.map.keySet())
                    tempState.map.put(i,state.map.get(i).clone());
                tempState.map.get(leftValue).x = tempState.map.get(leftValue).x+1;
                tempState.map.get(0).x = tempState.map.get(0).x-1;
                tempState.step = step;
                if(tempState.calculate(tempState.map)!=0)
                    queue.add(tempState);
                else {
                    System.out.println(tempState.step);
                    break;
                }
            }
        }
    }

}

class State implements Comparable<State>{
    public HashMap<Integer,Coordinate> map;
    public int step=0;
    @SuppressWarnings("unchecked")
    public State(){
        this.map = new HashMap<Integer, Coordinate>();
    }
   public int getRightNodeValue(Coordinate a){
       if(a.x+1<4){
           for(Map.Entry<Integer,Coordinate> entry:map.entrySet()) {
               if (entry.getValue().x == a.x + 1 && entry.getValue().y == a.y) {
                   return entry.getKey();
               }
           }
               return -1;
       }
       else
           return -1;
   }
    public int getLeftNodeValue(Coordinate a){
        if(a.x-1>0){
            for(Map.Entry<Integer,Coordinate> entry:map.entrySet()) {
                if (entry.getValue().x == a.x - 1 && entry.getValue().y == a.y) {
                    return entry.getKey();
                }
            }
            return -1;
        }
        else
            return -1;
    }
    public int getTopNodeValue(Coordinate a){
        if(a.y-1>0){
            for(Map.Entry<Integer,Coordinate> entry:map.entrySet()) {
                if (entry.getValue().x == a.x  && entry.getValue().y == a.y-1) {
                    return entry.getKey();
                }
            }
            return -1;
        }
        else
            return -1;
    }
    public int getBottomNodeValue(Coordinate a){
        if(a.y+1<4){
            for(Map.Entry<Integer,Coordinate> entry:map.entrySet()) {
                if (entry.getValue().x == a.x&& entry.getValue().y == a.y+1) {
                    return entry.getKey();
                }
            }
            return -1;
        }
        else
            return -1;
    }
    public int calculate(Map<Integer,Coordinate> map){
        int sum = 0;
        for(int key:map.keySet())
                switch (key) {
                    case 0: break;
                    case 3: sum+=3-map.get(key).x+Math.abs(1-map.get(key).y);break;
                    case 6: sum+=3-map.get(key).x+Math.abs(2-map.get(key).y);break;
                    default: sum+=Math.abs(key%3-map.get(key).x)+Math.abs(key/3+1-map.get(key).y);break;
                }
        return sum;
    }
    @Override
    public int compareTo(State o) {
        return Integer.compare(calculate(map),o.calculate(o.map));
    }
}
class Coordinate implements Cloneable{
    int x,y;
    public Coordinate(int x,int y){
        super();
        this.x = x;
        this.y = y;
    }
    @Override
    public Coordinate clone(){
        Coordinate c = null;
        try{
            c = (Coordinate)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return c;
    }
}