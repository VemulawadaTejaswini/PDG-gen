import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.nextLine());
        int[] move = {Integer.parseInt(sc.nextLine()), 
                    Integer.parseInt(sc.nextLine()), 
                    Integer.parseInt(sc.nextLine()), 
                    Integer.parseInt(sc.nextLine()), 
                    Integer.parseInt(sc.nextLine())};
        
        int[] cities = {0, 0, 0, 0, 0};
        int time = 0;
        int ride = 0;
        
        while(cities[cities.length - 1] < n){
            for(int i = cities.length - 1; i >= 1; i--){
                if(cities[i - 1] <= move[i]){
                    ride = cities[i];
                }else{
                    ride = move[i];
                }
                cities[i - 1] -= ride;
                cities[i] += ride;
            }
            
            if(n <= move[0]){
                ride = (int)n;
            }else{
                ride = move[0];
            }
            n -= ride;
            cities[0] += ride;
            
            time += 1;
        }
        
        System.out.println(time);
    }
}
