import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Robot> roboList = new ArrayList<Robot>();
        for(int i=0;i<n;i++){
            String line[] = sc.nextLine().split(" ");
            Robot r = new Robot(Integer.parseInt(line[0]),Integer.parseInt(line[1]));
            roboList.add(r);
        }
        // ソート
        Collections.sort(roboList, new RobotComparator());
        for(int i=0;i+1<roboList.size();i++){
            Robot robo = roboList.get(i);
            Robot roboNext = roboList.get(i+1);
            // 相対距離
            int dis = roboNext.getX() - robo.getX();
            // 腕の長さの合計
            int sum = roboNext.getL() + robo.getL();
            if(dis < sum){
                roboList.remove(i);
            }
        }
        System.out.println(roboList.size());
    }
    
    static class Robot {
        int x;
        int l;
        public Robot(int x, int l){
            this.x = x;
            this.l =l;
        }
        public int getX(){
            return x;
        }
        public int getL(){
            return l;
        }
    }
    
    static class RobotComparator implements Comparator<Robot> {

    	@Override
    	public int compare(Robot p1, Robot p2) {
    		return p1.getX() < p2.getX() ? -1 : 1;
    	}
    }
    
}
