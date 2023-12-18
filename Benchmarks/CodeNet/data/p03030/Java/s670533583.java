import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        List<City> citys = new ArrayList<>();
        for(int i = 0;i<N;i++){
            citys.add(new City(i+1,sc.next(), sc.nextInt()));
        }
        
        citys.stream().sorted(Comparator.comparing(City::getName).thenComparing(City::getPoint, Comparator.reverseOrder())).forEach(System.out::println);
        
    }
}

class City{
    public int id;
    public int point;
    public String name;
    public City(int id, String name, int point){
        this.id = id;
        this.point = point;
        this.name = name;
    }
    @Override
    public String toString(){
        return String.valueOf(id) + " " + point + " "+name;
    }
    
    public String getName(){
        return name;
    }
    public int getPoint(){
        return point;
    }
}
