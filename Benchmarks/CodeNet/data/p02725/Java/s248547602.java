import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total_distance = sc.nextInt();
        int number_of_points = sc.nextInt();
        ArrayList<Integer> points = new ArrayList<>();
        for(int i=0;i < number_of_points;i++){
            int temp_int = sc.nextInt();
            if(temp_int > total_distance/2){
                points.add(temp_int-total_distance);
            }else{
                points.add(temp_int);
            }
        }
        Collections.sort(points);
        System.out.println(points.get(number_of_points-1) - points.get(0));
    }
}