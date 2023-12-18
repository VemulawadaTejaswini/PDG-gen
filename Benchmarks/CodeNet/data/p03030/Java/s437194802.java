import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Restaurant> list = new ArrayList<Restaurant>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            int p = sc.nextInt();
            Restaurant r = new Restaurant(s,p,i+1);
            list.add(r);
        }
        Collections.sort(list);
        for(Restaurant r : list){
            //System.out.println(r.index);
        }
    }
}

class Restaurant implements Comparable<Restaurant>{
    String town;
    int point;
    int index;
    public Restaurant(String s, int p, int i){
        this.town = s;
        this.point = p;
        this.index = i;
    }
    
    public int compareTo(Restaurant r2) {
        int chk = this.town.compareTo(r2.town);
        if(chk <= -1){ 
          return -1; 
        }else if(chk >= 1){
          return 1;
        }else{
            if(this.point > r2.point){
                return -1;
            }else{
                return 1;
            }
        }
    }
}
//ムリ、わからん