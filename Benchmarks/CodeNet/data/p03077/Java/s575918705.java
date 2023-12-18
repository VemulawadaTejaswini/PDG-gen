import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.nextLine());
        long[] move = {Long.parseLong(sc.nextLine()), 
                    Long.parseLong(sc.nextLine()), 
                    Long.parseLong(sc.nextLine()), 
                    Long.parseLong(sc.nextLine()), 
                    Long.parseLong(sc.nextLine())};
        
        long[] cities = {n, 0, 0, 0, 0, 0};
        long time = 0;
        long ride = 0;
        
        while(cities[cities.length - 1] < n){
            for(int i = cities.length - 2; i >= 0; i--){
                if(cities[i] <= move[i]){
                    ride = cities[i];
                }else{
                    ride = move[i];
                }
                cities[i] -= ride;
                cities[i + 1] += ride;
            }
            time += 1;
        }
        
        System.out.println(time);
    }
}
