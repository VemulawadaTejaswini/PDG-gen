import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m= sc.nextInt(), s=sc.nextInt(), t =sc.nextInt();

    int[][] paths = new int[m][4];
    for(int i=0; i<m; i++){
      for(int j=0;j<4; j++){
        paths[i][j] = sc.nextInt();
      }
    }
    int[] snook = new int[n+1];
    int[] yen = new int[n+1];
    for(int i=0;i<n+1;i++){
      snook[i] = Integer.MAX_VALUE;
      yen[i] = Integer.MAX_VALUE;
    }
    yen[s]=0;snook[t]=0;

    Queue<Integer> city_to_visit = new ArrayDeque<Integer>();
    city_to_visit.add(s);
    while(!city_to_visit.isEmpty()){
      int city = city_to_visit.poll();
      for(int[] path: paths){
        if(path[0]==city && path[2]+yen[city] < yen[path[1]]){
          yen[path[1]] = path[2]+yen[city];
          city_to_visit.add(path[1]);
        }else
        if(path[1]==city && path[2]+yen[city] < yen[path[0]]){
          yen[path[0]] = path[2]+yen[city];
          city_to_visit.add(path[0]);
        }
      }
    }
    city_to_visit.add(t);
    while(!city_to_visit.isEmpty()){
      int city = city_to_visit.poll();
      for(int[] path: paths){
        if(path[0]==city && path[3]+snook[city] < snook[path[1]]){
          snook[path[1]] = path[3]+snook[city];
          city_to_visit.add(path[1]);
        }else
        if(path[1]==city && path[3]+snook[city] < snook[path[0]]){
          snook[path[0]] = path[3]+snook[city];
          city_to_visit.add(path[0]);
        }
      }
    }
    for(int i=0;i<n;i++){
      int min_ = Integer.MAX_VALUE;
      for(int j=i+1;j<n+1;j++){
        min_ = min_ < yen[j]+snook[j] ? min_ :yen[j]+snook[j];
      }
      System.out.println(Math.pow(10,15)-min_);
    }
  }
}